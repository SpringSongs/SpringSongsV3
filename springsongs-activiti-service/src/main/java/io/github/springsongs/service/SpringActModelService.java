package io.github.springsongs.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ModelQuery;
import org.activiti.engine.repository.ProcessDefinition;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.pagehelper.PageInfo;

import io.github.springsongs.domain.SpringActModel;
import io.github.springsongs.enumeration.ResultCode;
import io.github.springsongs.exception.SpringSongsException;

@Service
public class SpringActModelService {
	private static final Logger logger = LoggerFactory.getLogger(SpringActModelService.class);

	@Autowired
	RepositoryService repositoryService;

	@Autowired
	ObjectMapper objectMapper;

	@Transactional
	public Model save(SpringActModel SpringActModel) {
		try {
			Model newModel = repositoryService.newModel();
			ObjectMapper objectMapper = new ObjectMapper();
			ObjectNode modelObjectNode = objectMapper.createObjectNode();
			modelObjectNode.put(ModelDataJsonConstants.MODEL_NAME, SpringActModel.getName());
			modelObjectNode.put(ModelDataJsonConstants.MODEL_REVISION, 1);
			modelObjectNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION,
					StringUtils.defaultString(SpringActModel.getDescription()));
			newModel.setMetaInfo(modelObjectNode.toString());
			newModel.setName(SpringActModel.getName());
			newModel.setCategory(SpringActModel.getCategoryCode());
			newModel.setKey(StringUtils.defaultString(SpringActModel.getKey()));
			repositoryService.saveModel(newModel);
			ObjectNode editorNode = objectMapper.createObjectNode();
			editorNode.put("id", "canvas");
			editorNode.put("resourceId", "canvas");
			ObjectNode stencilSetNode = objectMapper.createObjectNode();
			stencilSetNode.put("namespace", "http://b3mn.org/stencilset/bpmn2.0#");
			editorNode.put("stencilset", stencilSetNode);
			repositoryService.addModelEditorSource(newModel.getId(), editorNode.toString().getBytes("utf-8"));
			return newModel;
		} catch (UnsupportedEncodingException ex) {
			logger.error(ex.getMessage());
			throw new SpringSongsException(ResultCode.SYSTEM_ERROR);
		}

	}

	public PageInfo<Model> getAllRecordByPage(SpringActModel springActModelQuery,int page,int size) {
		ModelQuery modelQuery = repositoryService.createModelQuery().latestVersion().orderByLastUpdateTime().desc();
		if (StringUtils.isNotBlank(springActModelQuery.getCategoryCode())) {
			modelQuery.modelCategory(springActModelQuery.getCategoryCode());
		}
		if (StringUtils.isNotBlank(springActModelQuery.getKey())) {
			modelQuery.modelKey(springActModelQuery.getKey());
		}
		if (StringUtils.isNotBlank(springActModelQuery.getName())) {
			modelQuery.modelName(springActModelQuery.getName());
		}
		List<Model> models=modelQuery.listPage(page, size);
		PageInfo pringAritlcesPageInfo = new PageInfo<>(models);
		pringAritlcesPageInfo.setList(models);
		return pringAritlcesPageInfo;
	}

	@Transactional
	public void update(SpringActModel viewEntity, String id) {
		Model modelData = repositoryService.getModel(id);
		modelData.setCategory(viewEntity.getCategoryCode());
		repositoryService.saveModel(modelData);
	}

	@Transactional
	public void delete(List<String> ids) {
		for (String id : ids) {
			repositoryService.deleteModel(id);
		}
	}

	@Transactional
	public void deploy(String id) {
		try {
			Model modelData = repositoryService.getModel(id);
			ObjectNode modelNode = (ObjectNode) new ObjectMapper()
					.readTree(repositoryService.getModelEditorSource(modelData.getId()));
			BpmnModel bpmnModel = new BpmnJsonConverter().convertToBpmnModel(modelNode);
			String processName = modelData.getName();
			if (!StringUtils.endsWith(processName, ".bpmn20.xml")) {
				processName += ".bpmn20.xml";
			}
			Deployment deployment = repositoryService.createDeployment().name(modelData.getName())
					.addBpmnModel(processName, bpmnModel).deploy();
			List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery()
					.deploymentId(deployment.getId()).list();
			if (list.size() == 0) {
				throw new SpringSongsException(ResultCode.MODEL_NOT_EXIST);
			}
			list.stream().forEach(processDefinition -> {
				repositoryService.setProcessDefinitionCategory(processDefinition.getId(), modelData.getCategory());
			});
		} catch (IOException e) {
			logger.error(e.getMessage());
			throw new SpringSongsException(ResultCode.SYSTEM_ERROR);
		}
	}
}

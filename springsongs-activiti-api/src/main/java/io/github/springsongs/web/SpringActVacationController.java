package io.github.springsongs.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.springsongs.dto.ReponseResultPageDTO;
import io.github.springsongs.dto.ResponseDTO;
import io.github.springsongs.dto.SpringActVacationDTO;
import io.github.springsongs.service.ISpringActVacationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags = "请假流程管理")
@RestController
@RequestMapping(value = "/SpringActVacation")
public class SpringActVacationController {
	private static final Logger logger = LoggerFactory.getLogger(SpringActVacationController.class);

	@Autowired
	private ISpringActVacationService springActVacationService;

	@ApiOperation(value = "获取请假流程管理分页列表", response = ReponseResultPageDTO.class)
	@ApiImplicitParams({ @ApiImplicitParam(name = "springJobQuery", dataType = "SpringActVacationDTO"),
			@ApiImplicitParam(name = "page", dataType = "int"), @ApiImplicitParam(name = "size", dataType = "int") })
	@PostMapping(value = "/ListByPage")
	public ReponseResultPageDTO<List<SpringActVacationDTO>> listByPage(@RequestBody SpringActVacationDTO springJobQuery,
			@RequestParam("page") int page, @RequestParam("size") int size) {
		ReponseResultPageDTO<List<SpringActVacationDTO>> reponseResultPageDTO = springActVacationService
				.listByPage(springJobQuery, page, size);
		return reponseResultPageDTO;
	}

	@ApiOperation(value = "获取请假流程管理")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", dataType = "String") })
	@GetMapping(value = "/Detail")
	public ResponseDTO<SpringActVacationDTO> get(@NotEmpty(message = "id不能为空") String id) {
		ResponseDTO<SpringActVacationDTO> responseDTO = springActVacationService.get(id);
		return responseDTO;
	}

	@ApiOperation(value = "创建请假流程管理", notes = "根据SpringAritlceDTO内容管理")
	@ApiImplicitParams({ @ApiImplicitParam(name = "viewEntity", dataType = "SpringActVacationDTO"),
			@ApiImplicitParam(name = "request", dataType = "HttpServletRequest"), })
	@PostMapping(value = "/Create")
	public ResponseDTO<String> save(@RequestBody @Valid SpringActVacationDTO viewEntity, HttpServletRequest request) {
		ResponseDTO<String> responseDTO = springActVacationService.save(viewEntity);
		return responseDTO;
	}

	@ApiOperation(value = "修改请假管理", notes = "根据SpringJobDTO对象修改请假管理")
	@ApiImplicitParams({ @ApiImplicitParam(name = "viewEntity", dataType = "SpringAritlceDTO"),
			@ApiImplicitParam(name = "request", dataType = "HttpServletRequest"), })
	@PutMapping(value = "/Edit")
	public ResponseDTO<String> update(@RequestBody @Valid SpringActVacationDTO viewEntity, HttpServletRequest request) {
		ResponseDTO<String> responseDTO = springActVacationService.update(viewEntity);
		return responseDTO;
	}

	@ApiOperation(value = "删除假流程管理", notes = "根据List<String>对象删除假流程管理")
	@ApiImplicitParam(dataType = "List<String>", name = "ids", value = "内容管理编号", required = true)
	@PostMapping(value = "/SetDeleted")
	public ResponseDTO<String> setDeleted(@RequestParam(value = "ids") List<String> ids) {
		ResponseDTO<String> responseDTO = springActVacationService.setDeleted(ids);
		return responseDTO;
	}

	@ApiOperation(value = "提交假流程管理", notes = "根据SpringActVacationDTO对象提交假流程管理")
	@ApiImplicitParam(dataType = "SpringActVacationDTO", name = "viewEntity", value = "内容管理编号", required = true)
	@PostMapping(value = "/SubmitSpringActVacation")
	public ResponseDTO<String> submitSpringActVacation(@RequestBody @Valid SpringActVacationDTO viewEntity) {
		ResponseDTO<String> responseDTO = springActVacationService.submitSpringActVacation(viewEntity);
		return responseDTO;
	}

}

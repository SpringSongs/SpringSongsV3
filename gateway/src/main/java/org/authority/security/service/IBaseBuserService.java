package org.authority.security.service;

import java.util.List;

import org.authority.domain.Member;
import org.authority.security.service.impl.BaseBuserServiceImpl;
import org.authority.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "AUTHORITY-SERVICE", fallback =BaseBuserServiceImpl.class)
public interface IBaseBuserService {

	@RequestMapping(value = "/BaseBuser/DeleteByPrimaryKey", method = RequestMethod.POST)
	R deleteByPrimaryKey(@RequestParam("id") String id);

	@RequestMapping(value = "/BaseBuser/Insert", method = RequestMethod.POST)
	R insert(@RequestBody Member record);

	@RequestMapping(value = "/BaseBuser/SelectByPrimaryKey", method = RequestMethod.POST)
	R selectByPrimaryKey(@RequestParam("id") String id);

	@RequestMapping(value = "/BaseBuser/UpdateByPrimaryKey", method = RequestMethod.POST)
	R updateByPrimaryKey(@RequestBody Member record);

	@RequestMapping(value = "/BaseBuser/GetAllRecordByPage", method = RequestMethod.POST)
	R getAllRecordByPage(@RequestBody Member record,@RequestParam("page")  int page,@RequestParam("size") int size);

	@RequestMapping(value = "/BaseBuser/SetDeleted", method = RequestMethod.POST)
	R setDeleted(@RequestParam("ids") List<String> ids);
	
	@RequestMapping(value = "/BaseBuser/BatchSaveExcel", method = RequestMethod.POST)
	R batchSaveExcel(@RequestParam("list") List<String[]> list);

	@RequestMapping(value = "/BaseBuser/GetByUserName", method = RequestMethod.POST)
	R getByUserName(@RequestParam("username") String username);
}
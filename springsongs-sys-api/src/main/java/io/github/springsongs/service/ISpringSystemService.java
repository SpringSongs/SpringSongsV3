package io.github.springsongs.service;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import io.github.springsongs.dto.ReponseResultPageDTO;
import io.github.springsongs.dto.ResponseDTO;
import io.github.springsongs.dto.SpringSystemDTO;
import io.github.springsongs.interceptor.SecuringRequestInterceptor;
import io.github.springsongs.service.hystrix.SpringSystemServiceHystrix;

@FeignClient(name = "SPRINGSONGS-SYS-SERVICE", path = "/SpringSystem", fallback = SpringSystemServiceHystrix.class, configuration = SecuringRequestInterceptor.class)
public interface ISpringSystemService {

	@PostMapping(value = "/ListByPage")
	public ReponseResultPageDTO<List<SpringSystemDTO>> listByPage(@RequestBody SpringSystemDTO springAritlceQuery,@RequestParam("page") int page, @RequestParam("size") int size);

	@PostMapping(value = "/Detail")
	public ResponseDTO<SpringSystemDTO> get(@RequestParam(value = "id", required = true) @NotEmpty(message = "id不能为空") String id);

	@PostMapping(value = "/Create")
	public ResponseDTO<String> save(@RequestBody SpringSystemDTO viewEntity);

	@PutMapping(value = "/Edit")
	public ResponseDTO<String> update(@RequestBody SpringSystemDTO viewEntity);

	@PostMapping(value = "/SetDeleted")
	public ResponseDTO<String> setDeleted(@RequestParam(value = "ids", required = true) List<String> ids);

	@GetMapping(value = "/ListAll")
	public ResponseDTO<List<SpringSystemDTO>> listAll();
}

package com.test.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.springcloud.entities.User;

@FeignClient(value = "SPRINGCLOUD-USER", fallbackFactory = UserClientServiceFallbackFactory.class)
public interface UserClientService {

	
	@RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
	User get(@PathVariable("id") int id);
	
	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	List<User> list();
}

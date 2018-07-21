package com.test.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.springcloud.entities.User;
import com.test.springcloud.service.UserClientService;

@RestController
public class UserController {
	
	@Autowired
	private UserClientService service;
	

	@RequestMapping(value = "/consumer/user/get/{id}", method = RequestMethod.GET)
	public User get(@PathVariable("id") int id){
		return this.service.get(id);
	}
	
	@RequestMapping(value = "/consumer/user/list", method = RequestMethod.GET)
	public List<User> list(){
		return this.service.list();
	}
}

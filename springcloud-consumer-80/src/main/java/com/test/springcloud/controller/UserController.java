package com.test.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.springcloud.entities.User;

@RestController
@RequestMapping(value = "/consumer/user")
public class UserController {

	private static final String PROVIDER_URL = "http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public User get(@PathVariable("id") int id){
		return restTemplate.getForObject(PROVIDER_URL + "/user/get/" + id, User.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<User> list(){
		return restTemplate.getForObject(PROVIDER_URL + "/user/list", List.class);
	}
}

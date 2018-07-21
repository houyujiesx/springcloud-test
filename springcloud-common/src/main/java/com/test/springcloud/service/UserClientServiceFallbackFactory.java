package com.test.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.test.springcloud.entities.User;

import feign.hystrix.FallbackFactory;

@Component
public class UserClientServiceFallbackFactory implements FallbackFactory<UserClientService>{

	@Override
	public UserClientService create(Throwable arg0) {
		return new UserClientService() {
			
			@Override
			public List<User> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public User get(int id) {
				// TODO Auto-generated method stub
				return new User().setId(6);
			}
		};
	}

}

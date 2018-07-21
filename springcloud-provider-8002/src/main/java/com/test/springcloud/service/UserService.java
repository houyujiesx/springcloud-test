package com.test.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springcloud.dao.UserDao;
import com.test.springcloud.entities.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public User get(int id){
		return userDao.getById(id);
	}
	
	public List<User> list(){
		return userDao.getAll();
	}
}

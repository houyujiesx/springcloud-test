package com.test.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.springcloud.entities.User;

@Mapper
public interface UserDao {

	User getById(int id);
	
	List<User> getAll();
}

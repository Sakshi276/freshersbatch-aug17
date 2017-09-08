package com.spring.SpringRestMongoDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.SpringRestMongoDemo.collections.CategoryCollection;
import com.spring.SpringRestMongoDemo.collections.UserSession;
import com.spring.SpringRestMongoDemo.dao.UserDao;

import com.spring.SpringRestMongoDemo.entity.Session;
import com.spring.SpringRestMongoDemo.entity.User;

public class UserServiceImpl implements UserInterface{
	
	@Autowired
	UserDao userDao;
	
	public User createUser(User user)
	{
		return userDao.createUser(user);
	}
	
	

	public UserSession loginUser(Session session) {
		return null;
	}
	
	public List<CategoryCollection> getCategories()
	{
		return userDao.getCategories();
	}

}

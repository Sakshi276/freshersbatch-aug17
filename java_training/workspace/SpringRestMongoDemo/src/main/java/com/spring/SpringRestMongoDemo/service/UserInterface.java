package com.spring.SpringRestMongoDemo.service;

import java.util.List;

import com.spring.SpringRestMongoDemo.collections.CategoryCollection;
import com.spring.SpringRestMongoDemo.collections.UserSession;

import com.spring.SpringRestMongoDemo.entity.Session;
import com.spring.SpringRestMongoDemo.entity.User;

public interface UserInterface {
	
	public User createUser(User user);
	public UserSession loginUser(Session session);
	public List<CategoryCollection> getCategories();
}

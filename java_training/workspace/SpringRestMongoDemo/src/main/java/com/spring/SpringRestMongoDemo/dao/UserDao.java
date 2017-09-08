package com.spring.SpringRestMongoDemo.dao;


import java.util.List;

import com.spring.SpringRestMongoDemo.collections.CategoryCollection;

import com.spring.SpringRestMongoDemo.entity.User;

public interface UserDao {
	
	public User createUser(User user);
	
	public List<CategoryCollection> getCategories();

}

package com.spring.SpringRestMongoDemo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.SpringRestMongoDemo.collections.CategoryCollection;
import com.spring.SpringRestMongoDemo.collections.UserCollection;
import com.spring.SpringRestMongoDemo.collections.UserSession;

import com.spring.SpringRestMongoDemo.entity.Session;
import com.spring.SpringRestMongoDemo.entity.User;
import com.spring.SpringRestMongoDemo.repository.CategoryRepository;
import com.spring.SpringRestMongoDemo.repository.SessionRepository;
import com.spring.SpringRestMongoDemo.repository.UserRepository;

public class UserMongoDaoImpl implements UserDao {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SessionRepository sessionRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public User createUser(User user)
	{
		UserCollection userCollection = new UserCollection();
		userCollection.setFirstName(user.getFirstName());
		userCollection.setLastName(user.getLastName());
		userCollection.setUserName(user.getUserName());
		userCollection.setPassword(user.getPassword());
		userCollection.setEmail(user.getEmail());
		userCollection.setPhone(user.getPhone());
		
		System.out.println("Inside DAO");
		
		userRepository.save(userCollection);
		return user;
	}
	
	public UserSession loginUser(Session user)
	{
		UserCollection uCollection=userRepository.login(user.getUserName(), user.getPassword());
		if(uCollection!=null)
		{
			UserSession usession=new UserSession();
			usession.setUserName(user.getUserName());
			usession.setLastUpdatedDate(new Date());
			sessionRepository.save(usession);
			return usession;
		}
		else
		{
			return null;
		}
	}
	
	

	public List<CategoryCollection> getCategories() {
		List<CategoryCollection> categories=categoryRepository.findAll();
		return categories;
	}
}

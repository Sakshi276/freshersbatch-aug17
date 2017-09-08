package com.spring.SpringRestMongoDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringRestMongoDemo.collections.CategoryCollection;
import com.spring.SpringRestMongoDemo.collections.UserSession;

import com.spring.SpringRestMongoDemo.entity.Session;
import com.spring.SpringRestMongoDemo.entity.User;
import com.spring.SpringRestMongoDemo.service.UserInterface;
import com.spring.SpringRestMongoDemo.service.UserServiceImpl;

@RestController
@RequestMapping("/xornet")
public class UserController {
	
	/*
	@RequestMapping(value="/user", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user) {
		System.out.println("user = " + user);
		return user;

	}
	*/
	
	/*
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String sayHello(@RequestParam String uname)
	{
		return "Hello " + uname;  
	}
	*/
	
	/*
	@RequestMapping(value="/hello/{city}", method=RequestMethod.GET)
	public String sayHello(@RequestParam(name="name", defaultValue="Ivan")
							String uname,
						@PathVariable(value="city") String myCity,
						@RequestHeader(value="auth-token") String authToken) {
		System.out.println("myCity = " + myCity);
		System.out.println("authToken = " + authToken);
		return "Hello " + uname;
	}
	*/
	
	/*
	@RequestMapping(value="/matrix/{userDetails}", method=RequestMethod.GET)
	public void printMatrix(
			@MatrixVariable(pathVar="userDetails", name="city") String city) {
		System.out.println("MAP: " + city);
	}
	*/
	
	@Autowired
	UserInterface userService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user)
	{
		System.out.println(user + "registered sucessfully!");
		return userService.createUser(user);
	}
	
	@RequestMapping(value="/category", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<CategoryCollection> getCategory()
	{
		System.out.println("categories are retrieved successfully!");
		return  userService.getCategories();
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserSession loginUser(@RequestBody Session session)
	{
		System.out.println("logged in sucessfully!");
		String authToken=userService.loginUser(session).toString();
	
		
		return userService.loginUser(session);
		
		
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.DELETE)
	public void logout(@RequestBody Session session)
	{
		System.out.println("logged out successfully!");
	}
	
}

package com.spring.SpringRestMongoDemo.entity;

import org.hibernate.validator.constraints.Email;

public class User {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	@Email
	private String email;
	private long phone;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstName, String lastName, String userName, String password, String email, long phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	

}

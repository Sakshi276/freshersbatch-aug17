package com.spring.SpringRestMongoDemo.entity;



public class Session {
	
	private String userName;
	private String password;
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
	@Override
	public String toString() {
		return "Session [userName=" + userName + ", password=" + password + "]";
	}
	
	

}

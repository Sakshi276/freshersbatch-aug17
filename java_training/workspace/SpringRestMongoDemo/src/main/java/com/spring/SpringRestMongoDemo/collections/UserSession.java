package com.spring.SpringRestMongoDemo.collections;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.spring.SpringRestMongoDemo.entity.User;

@Document(collection="user_session")
public class UserSession {
	
	@Id
	private String id;
	private String userName;
	private Date lastUpdatedDate;
	public UserSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSession(String id, String userName, Date lastUpdatedDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	@Override
	public String toString() {
		return "UserSession [id=" + id + ", userName=" + userName + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}
	
	public void createUser(User user)
	{
		this.setUserName(user.getUserName());
		this.setLastUpdatedDate(new Date());
	}
	
	

}

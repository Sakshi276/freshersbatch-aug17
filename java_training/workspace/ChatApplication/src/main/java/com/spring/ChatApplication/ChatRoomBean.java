package com.spring.ChatApplication;

import java.util.List;
import java.util.Set;

public class ChatRoomBean {
	
	@Override
	public String toString() {
		return "ChatRoomBean [users=" + users + ", messages=" + messages + "]";
	}

	private Set<String> users;
	private List<String> messages;
	
	public ChatRoomBean() {
		super();
		
	}

	public ChatRoomBean(Set<String> users, List<String> messages) {
		super();
		this.users = users;
		this.messages = messages;
	}

	public Set<String> getUsers() {
		return users;
	}

	public void setUsers(Set<String> users) {
		this.users = users;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	
	
	

}

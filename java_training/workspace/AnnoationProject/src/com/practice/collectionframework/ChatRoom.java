package com.practice.collectionframework;

import java.util.*;

public class ChatRoom {

	String name;
	
	static Set<String> chatroom=new HashSet<String>();
	static HashMap<String,String> userdetails=new HashMap<String,String>(); 
	static  ArrayList<String> messageList=new ArrayList<String>();
	public ChatRoom(String name)
	{
		this.name=name;
		chatroom.add(name);
		
		
	}
	
	public ChatRoom()
	{
		
	}
	
	public void deleteUser(String dcuname)
	{
		userdetails.remove(dcuname);
		System.out.println(dcuname + " is deleted successfully!");
	}
	
	public void deleteChatRoom(String croom)
	{
		chatroom.remove(croom);
		System.out.println("Deleted successfully!");
	}
	
	public void showUsers()
	{
		for(Map.Entry<String, String> entry:userdetails.entrySet())
		{
			 String key=entry.getKey();
			 System.out.println("User:"+key);
		}
	}
	
	public void show()
	{
		for(String nam:chatroom)
		{
			System.out.println(nam);
		}
	}
	
	public static void addUser(String uname,String password)
	{
		userdetails.put(uname,password);
	}
	
	public void addMessage(String message)
	{
		messageList.add(message);
	}
	
	public void showMessage()
	{
		 Iterator<String> itr=messageList.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
	
	public static boolean checkchatroom(String newroom)
	{
		int flag=0;
		for(String nam:chatroom)
		{
			if(newroom.equals(nam))
			{
				flag=1;
				break;
			}
			
		}
		if(flag==1)
			return true;
		else
			return false;
		
	}
	
	public static boolean checkCredentials(String cuname,String cpassword)
	{
		int flag=0;
		if(userdetails.containsKey(cuname))
		{
			if(userdetails.containsValue(cpassword))
			{
				flag=1;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	

	
}

package com.spring.ChatApplication;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext iocContainer=new ClassPathXmlApplicationContext("beans.xml");
    	//List<ChatRoomBean> chatrooms=(List)iocContainer.getBeansOfType(ChatRoomBean.class);
    	HashMap<String,ChatRoomBean> chatrooms=(HashMap)iocContainer.getBeansOfType(ChatRoomBean.class);
    	for(ChatRoomBean chatroom:chatrooms.values())
    	{
    		System.out.println(chatroom);
    		for(String user:chatroom.getUsers())
    		{
    			System.out.println(user);
    		}
    		for(String message:chatroom.getMessages())
    		{
    			System.out.println(message);
    		}
    	}
    }
}

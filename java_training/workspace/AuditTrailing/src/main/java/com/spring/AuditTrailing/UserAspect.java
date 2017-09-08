package com.spring.AuditTrailing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class UserAspect {
	
	@Pointcut("execution(* UserHandler.register(..))")     
	
	public void register_pointcut(){}
	
	 @Before("register_pointcut()")      
	 
	 public void checkUserName(JoinPoint jp)      
	 {        
		Object args[] = jp.getArgs(); 
		String name=(String)args[0].toString();
		System.out.println(name);
	 	if(name.length()<3)
	 	{
	 		System.out.println("username must be minimum 3 characters");
	 		System.exit(0);
	 	}
	 	else
	 	{
	 		System.out.println("registered successfully!");
	 	}
	 	
	 		
	 }  

}

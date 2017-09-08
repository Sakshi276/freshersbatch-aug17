package com.spring.StringOperationsAOP;

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
    	StringOperations strOperations=(StringOperations) iocContainer.getBean("stringOperationBean");
    	String s="";
    	try
    	{
    		strOperations.getCapStr(s);
    	}
    	catch(Exception e)
    	{
    	}
    	
    	try
    	{
    		strOperations.getLowerStr(s);
    	}
    	catch(Exception e)
    	{
    	}
    	
    	try
    	{
    		strOperations.getLength(s);
    	}
    	catch(Exception e)
    	{
    	}
    	
    	
    }
}

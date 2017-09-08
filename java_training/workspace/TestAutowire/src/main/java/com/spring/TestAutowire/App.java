package com.spring.TestAutowire;

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
    	EmployeeBean emp=(EmployeeBean)iocContainer.getBean(EmployeeBean.class);
    	System.out.println("Employee details:" + emp );
    }
}

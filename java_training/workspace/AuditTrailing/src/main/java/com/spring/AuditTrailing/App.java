package com.spring.AuditTrailing;

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
        UserHandler userHandler=(UserHandler) iocContainer.getBean("userHandlerBean");
        userHandler.register(new User("sa","sa","sakshi","India"));
    }
}

package com.spring.TestAround;

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
        TestTime testTime=(TestTime) iocContainer.getBean("testTimeBean");
        testTime.addInVector();
        testTime.addInList();
    }
}

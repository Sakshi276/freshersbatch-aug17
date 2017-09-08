package com.spring.Assignment1;

import java.util.HashMap;

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
        HashMap<String,Order> orders=(HashMap)iocContainer.getBeansOfType(Order.class);
        double totalPrice=0.0;
        for(Order order:orders.values())
        {
        	totalPrice+=order.getItem().getItemPrice();
        }
        
        System.out.println("Total price: " + totalPrice);
    }
}

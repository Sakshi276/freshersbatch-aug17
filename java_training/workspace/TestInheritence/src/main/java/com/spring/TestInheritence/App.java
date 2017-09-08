package com.spring.TestInheritence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        
        insertBike(sessionFactory);
        insertCar(sessionFactory);
        
        sessionFactory.close();
    }
    
    public static void insertBike(SessionFactory sessionFactory) {
    	
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Bike bike1=new Bike("B1",60L,280L);
    	session.persist(bike1);
    	
    	transaction.commit();
    	session.close();
		
	}
    
    public static void insertCar(SessionFactory sessionFactory) {
    	
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Car car1=new Car("C1",60L,6L);
    	session.persist(car1);
    	
    	transaction.commit();
    	session.close();
		
	}
}

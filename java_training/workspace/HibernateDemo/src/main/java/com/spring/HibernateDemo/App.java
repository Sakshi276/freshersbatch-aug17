package com.spring.HibernateDemo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;


public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        //insert(sessionFactory);
        //update(sessionFactory);
        //select(sessionFactory);
        //delete(sessionFactory);
        //testSetAndLoad(sessionFactory);
       // testUpdateVsMerge(sessionFactory);
        runQuery(sessionFactory);
        sessionFactory.close();
    }
    
    
    public static void runQuery(SessionFactory sessionFactory) {
    	
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Query query=session.getNamedQuery("getTotalSalary");
    	List sal=query.list();
    	System.out.println("Total sal: " + sal);
    	
    	Criteria cr = session.createCriteria(Employee.class); 
    	cr.setProjection(Projections.sum("empSalary"));
    	List totalSal=cr.list();
    	System.out.println("by criteria: " + totalSal);
    	
    	transaction.commit();
    	session.close();
		
	}
    
    
   /*
    public static void insert(SessionFactory sessionFactory) {
    	
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		SQLQuery sqlQuery=session.createSQLQuery("INSERT INTO PRODUCT_MASTER(P_ID,NAME,COST) VALUES (1,'LAPPY',50000)");
		sqlQuery.executeUpdate();
		
		transaction.commit();
		session.close();
		System.out.println("In insert method");
	}
    
    public static void update(SessionFactory sessionFactory) {
    	
    	Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Product product=session.load(Product.class, 1L);
		product.setPrice(80000);
		
		transaction.commit();
		session.close();
		System.out.println("In update method");
		
	}
    
    public static void select(SessionFactory sessionFactory)
    {
    	Session session=sessionFactory.openSession();
    	
    	Query query=session.createQuery("from Product");
    	List<Product> products=query.list();
    	System.out.println(products);
    	System.out.println("in select method");
    	
    	session.close();
		
    }
    
    public static void delete(SessionFactory sessionFactory) {
    	
    	Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Query query=session.createQuery("delete from Product");
		query.executeUpdate();
		
		transaction.commit();
		session.close();
		System.out.println("In delete method");
		
		
	}
    
    public static void testSetAndLoad(SessionFactory sessionFactory) {
    	
    	Session session=sessionFactory.openSession();
    	Product product=session.get(Product.class, 22L);
    	
    	
    	session.close();
		System.out.println("Testing set and load");
	}
    
    public static void testUpdateVsMerge(SessionFactory sessionFactory) {
    	
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
		
		Product product=session.get(Product.class, 1L);
		product.setPrice(80000);
		
		transaction.commit();
		session.close();
		
		product.setPrice(90000);
		
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		Product product2=session.get(Product.class, 1L);
		session.merge(product);
		transaction=session.beginTransaction();
		session.close();
		System.out.println("testing update vs merge");
		
	}
	*/
}

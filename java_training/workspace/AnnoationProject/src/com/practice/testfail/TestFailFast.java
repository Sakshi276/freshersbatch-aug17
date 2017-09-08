package com.practice.testfail;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class TestThread implements Runnable
{
	Thread t1,t2;
	List<String> list=new CopyOnWriteArrayList<String>();
	
	public TestThread()
	{
		t1=new Thread(this);
		t1.setName("iterate");
		t1.start();
		t2=new Thread(this);
		t2.setName("add");
		t2.start();
	}
	
	@Override
	public void run()
	{
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("iterate"))
		{
			ListIterator<String> litr = null;
			litr=list.listIterator(); 
			  
			  while(litr.hasNext()){
			       System.out.println(litr.next());
			       try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    }
		}
		
		else if(currentThread.getName().equals("add"))
		{
			list.add("Ravi");
			
			
			  list.add("Vijay");  
			  list.add("Ravi");  
			  list.add("Ajay"); 
		}
	}
}

public class TestFailFast {

	public static void main(String[] args) {
		
		new TestThread();

	}

}

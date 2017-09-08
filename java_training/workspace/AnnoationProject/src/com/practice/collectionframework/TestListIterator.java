package com.practice.collectionframework;

import java.util.*;

public class TestListIterator {

	public static void main(String[] args) {
		
		 ListIterator<String> litr = null;
		ArrayList<String> list=new ArrayList<String>(); 
		  list.add("Ravi"); 
		  list.add("Vijay");  
		  list.add("Ravi");  
		  list.add("Ajay");  
		  
		  litr=list.listIterator(); 
		  
		  while(litr.hasNext()){
		       litr.next();
		    }
		  
		  while(litr.hasPrevious())
		  {
			  System.out.println(litr.previous());
		  }

	}

}

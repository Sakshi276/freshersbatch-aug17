package com.practice.collectionframework;

import java.util.*;

public class TestHashSet {

	public static void main(String[] args) {
		
		 HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		 
		  set.add("Ajay");  
		   
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}

}

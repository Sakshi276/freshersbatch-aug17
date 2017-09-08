package com.practice.collectionframework;

import java.util.*;


class Person implements Comparable<Person>
{
	String name;
	int height;
	int weight;
	
	public Person(String name,int height,int weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public int compareTo(Person p) {  
	    if(weight>p.weight){  
	        return 1;  
	    }else if(weight<p.weight){  
	        return -1;  
	    }else{  
	    	if(height>p.height){  
		        return 1;  
		    }else if(height<p.height){  
		        return -1;  
		    }else{  
		      return 0;
		    }  
	    }  
	}  
}

public class TestTreeSet {

	public static void main(String[] args) {
		
		Set<Person> tset=new TreeSet<Person>();
		Person p1=new Person("CCC",15,20);
		Person p2=new Person("AAA",20,50);
		Person p3=new Person("BBB",10,50);
		
		tset.add(p1);
		tset.add(p2);
		tset.add(p3);
		
		for(Person p:tset){  
		    System.out.println("Name:"+p.name+" Height:"+p.height+" Weight:"+p.weight);  
		    }   

	}

}

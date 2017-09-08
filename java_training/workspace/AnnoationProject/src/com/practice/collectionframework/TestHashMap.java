package com.practice.collectionframework;

import java.util.*;
import java.util.Map.Entry;

class Date
{
	int day;
	int month;
	int year;
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString()
	{
		return this.day + "/"  + this.month + "/" + this.year;
	}
	
	 public boolean equals(Object obj)
	 {
		 if(obj instanceof Date)
		 {
			 Date d=(Date)obj;
			 if(this.day==d.day && this.month==d.month)
				 return true;
			 else
				 return false;
		 }
		 return false;
	 }
	 
	 public int hashCode()
	 {
		 return 10;
	 }
	
	
}

public class TestHashMap {

	
	public static void main(String[] args) {
		
		HashMap<Date, String> hmap = new HashMap<Date, String>();
		
		Date d1=new Date(27,6,1995);
		Date d2=new Date(11,9,1995);
		Date d3=new Date(15,10,1995);
		
		hmap.put(d1, "Sak");
	    hmap.put(d2, "Ekt");
	    hmap.put(d3, "Tan");
	    
	    Set<Entry<Date, String>> set = hmap.entrySet();
	      Iterator<Entry<Date, String>> iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	      
	      String var= hmap.get(new Date(27,7,1997));
	      System.out.println(var);
	     

	}

}

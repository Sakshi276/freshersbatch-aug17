package com.practice.collectionframework;

import java.util.*;

class Employee
{
	int empId;
	String empName;
	
	public boolean equals(Object obj)
	 {
		return true;
	 }
	
	public int hashCode()
	 {
		 return 10;
	 }
	
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	public String toString()
	{
		return "Emp id:" + this.empId + "Emp Name:" + this.empName;
	}
}

public class TestHashMapEmp {
	
	public static void main(String[] args) {
	
	HashMap<Employee,String> hmap = new HashMap<Employee,String>();
	
	Employee emp1=new Employee(10,"aaa");
	Employee emp2=new Employee(30,"ccc");
	Employee emp3=new Employee(20,"bbb");
	
	hmap.put(emp1,"HR");
    hmap.put(emp2,"Finance");
    hmap.put(emp3,"Training");
    
    System.out.println(hmap.get(emp1));

    
}
}

package com.spring.StringOperationsAOP;

public class StringOperations {
	
	private String testString;
	public StringOperations() {
		// TODO Auto-generated constructor stub
	}
	public StringOperations(String testString) {
		super();
		this.testString = testString;
	}
	
	public String getCapStr(String testString) throws Exception
	{
		if(!testString.isEmpty())
		{
			return testString.toUpperCase();
		}
		else
		{
			throw new Exception("Simulate new exception");
		}
		
	}
	
	public String getLowerStr(String testString) throws Exception
	{
		if(!testString.isEmpty())
		{
		return testString.toLowerCase();
		}
		else
		{
			throw new Exception("Simulate new exception");
		}
		
	}
	
	public int getLength(String testString) throws Exception
	{
		if(!testString.isEmpty())
		{
		return testString.length();
		}
		
		else
		{
			throw new Exception("Simulate new exception");
		}
	}

}

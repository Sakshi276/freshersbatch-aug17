package com.practice.testgeneric;

class MyWrapperClass<T>
{
	T data;
	
	public void set(T data)
	{
		this.data=data;
	}
	
	public T get()
	{
		return this.data;
	}
}

public class TestGeneric {

	public static void main(String[] args) {
		
		MyWrapperClass wrap=new MyWrapperClass();
		wrap.set("Hello");
		System.out.println(wrap.get());
		
	}

}

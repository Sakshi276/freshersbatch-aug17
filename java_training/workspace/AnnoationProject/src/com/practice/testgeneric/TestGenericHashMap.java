package com.practice.testgeneric;

import java.util.*;



public class TestGenericHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		hmap.put(20,"aaa");
		hmap.put(40,"bbb");
		hmap.put(60,"ccc");
		
		printMapKeyValues(hmap);
		
		

	}
	
	public static void printMapKeyValues(HashMap<? extends Number,?> map)
	{
		System.out.println(map.entrySet());
	}

}

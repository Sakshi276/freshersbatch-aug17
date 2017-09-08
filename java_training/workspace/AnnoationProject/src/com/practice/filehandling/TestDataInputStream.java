package com.practice.filehandling;

import java.io.*;

public class TestDataInputStream {
	
	public static void main(String[] args) throws Exception {
		

		File file = new File("D:/java_training/abc.txt"); 
		FileInputStream fis = new FileInputStream(file); 
		DataInputStream dis = new DataInputStream(fis); 
		
		int id = dis.readInt(); 
		double salary = dis.readDouble();
		String name = dis.readUTF(); 
		
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
		
		id = dis.readInt(); 
		salary = dis.readDouble();
		name = dis.readUTF(); 
		
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
		
		id = dis.readInt(); 
		salary = dis.readDouble();
		name = dis.readUTF(); 
		
		System.out.println(id);
		System.out.println(salary);
		System.out.println(name);
		
		dis.close(); 
		fis.close();

		
	}

}

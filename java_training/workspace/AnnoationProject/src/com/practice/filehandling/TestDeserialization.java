package com.practice.filehandling;

import java.io.*;

public class TestDeserialization {
	
	public static void main(String[] args) throws Exception{
		
		File file = new File("D:/java_training/abc.txt"); 
		FileInputStream fin = new FileInputStream(file);  
		ObjectInputStream in = new ObjectInputStream(fin); 
		Account account = (Account)in.readObject();
		
		System.out.println("order = " + account);

		
	}

}

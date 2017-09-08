package com.practice.filehandling;

import java.io.*;

public class TestDataStream {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/java_training/abc.txt"); 
		FileOutputStream fos = new FileOutputStream(file); 
		DataOutputStream dos = new DataOutputStream(fos);  
		
		
		dos.writeInt(10);
		dos.writeLong(10000);
		dos.writeChars("aaa");
		
		dos.writeInt(20);
		dos.writeLong(20000);
		dos.writeChars("bbb");
		
		dos.writeInt(30);
		dos.writeLong(30000);
		dos.writeChars("ccc");
		
		dos.flush();
		fos.flush(); 
		dos.close();
		fos.close();
		
		System.out.println("DataOutputStream sucessful!");

	}

}

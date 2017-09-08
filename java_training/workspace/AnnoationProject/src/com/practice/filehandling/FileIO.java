package com.practice.filehandling;

import java.io.*;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		File fileRead=new File("D:/java_training/abc.txt");
		File fileWrite=new File("D:/java_training/abc1.txt");
		
		FileInputStream fis = new FileInputStream(fileRead);
		FileOutputStream fos = new FileOutputStream(fileWrite); 
		StringBuilder sb = new StringBuilder(""); 
		int i = 0; 
		do 
		{ 
			i = fis.read(); 
			if(i != -1) 
				sb.append((char)i); 
		} 
		while(i != -1); 
		
		String strData = sb.toString();
		fos.write(strData.getBytes()); 
		
		fos.flush(); 
		fos.close();
		fis.close();

	}

}

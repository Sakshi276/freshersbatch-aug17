package com.practice.filehandling;

import java.io.*;
import java.sql.Date;

public class TestSerailization {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:/java_training/abc.txt");
		FileOutputStream fout = new FileOutputStream(file);  
		ObjectOutputStream out = new ObjectOutputStream(fout); 
		
		out.writeObject(new Account(10,"aaa",10000L,new Date(21,1,1963)));
		
		out.flush(); 
		out.close();


	}

}

package com.practice.filehandling;

import java.io.*;
import java.util.*;

public class TestSequenceInputStream {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin1=new FileInputStream("D:/java_training/abc.txt"); 
		FileInputStream fin2=new FileInputStream("D:/java_training/abc1.txt"); 
		FileInputStream fin3=new FileInputStream("D:/java_training/abc2.txt"); 
		
		Vector<FileInputStream> files=new Vector<FileInputStream>();
		files.add(fin1);
		files.add(fin2);
		files.add(fin3);
		Enumeration<FileInputStream> enu=files.elements();
		
		SequenceInputStream sis=new SequenceInputStream(enu); 
		int i;  
		while((i=sis.read())!=-1)
		{  
			System.out.println((char)i);  
		}  
		sis.close();
		fin1.close(); 
		fin2.close();
		fin3.close();

	}

}

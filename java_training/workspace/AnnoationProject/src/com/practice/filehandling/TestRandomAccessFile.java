package com.practice.filehandling;

import java.io.*;
import java.util.Scanner;

public class TestRandomAccessFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:/java_training/abc.txt"); 
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		
		Scanner scan = new Scanner(System.in);
		
		char ch='N';
		
		do
		{
			
			System.out.println("\nSelect any operation: ");
			
			System.out.println("1) Create");
			System.out.println("2) Read");
			System.out.println("3) Update");
			System.out.println("4) Delete");
			
			int choice =  scan.nextInt();
			
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter account id: ");
				raf.writeInt(scan.nextInt());
				
				System.out.println("Enter name: ");
				raf.writeChars(scan.next());
				
				System.out.println("Enter balance: ");
				raf.writeInt(scan.nextInt());
				
			break;
			
			case 2:
				
				raf.seek(0); 
				int id=raf.readInt();
				
				String name=raf.readUTF();
				
				int bal=raf.readInt();
				
				System.out.println("id: " + id + " Name: " + name + " Balance: " + bal);
				
				
			break;
			
			default : 
	            System.out.println("Wrong Entry \n ");
	        break;
			
			}
			
			System.out.println("\nDo you want to continue (Type y or n) \n");
	        ch = scan.next().charAt(0);
	        
		}while(ch=='y'||ch=='Y');
		
		raf.close();
		scan.close();

	}

}

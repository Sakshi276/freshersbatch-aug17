package com.practice.autocloseablepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestClose {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(FileInputStream input = new FileInputStream("read.txt")) {
			int data = input.read(); while(data != -1){ System.out.print((char) data); data = input.read(); }
			}


	}

}

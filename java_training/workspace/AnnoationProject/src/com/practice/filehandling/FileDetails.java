package com.practice.filehandling;

import java.io.*;

public class FileDetails {

	public static void main(String[] args) {

		File fileDir=new File("D:/java_training/TestDir");
		getAllFiles(fileDir);

	}
	
	private static void getAllFiles(File fileDir) {

        File[] filesList = fileDir.listFiles();
        for(File f : filesList){
            if(f.isDirectory())
                System.out.println(f.getName() + "is a directory");
            if(f.isFile()){
                System.out.println(f.getName() + "is a file");
                
            }
            System.out.println("Size: " + f.getTotalSpace());
            System.out.println("Last modified: " + f.lastModified());
            
            
        }

    }

}

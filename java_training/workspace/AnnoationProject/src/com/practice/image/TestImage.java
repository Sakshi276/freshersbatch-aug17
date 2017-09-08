package com.practice.image;

import java.io.*;
import java.sql.*;

import org.apache.commons.dbcp2.BasicDataSource;

public class TestImage{
	
	public static BasicDataSource customizeConnection(BasicDataSource dataSource)
	{
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("system");
		dataSource.setPassword("admin");
		dataSource.setMaxIdle(10);
		dataSource.setMinIdle(5);
		dataSource.setMaxTotal(10);
		return dataSource;
	}
	
	public static void insertImage()
	{
		try(
				BasicDataSource dataSource=customizeConnection(new BasicDataSource());
				Connection con=dataSource.getConnection();
				PreparedStatement pstmt =con.prepareStatement("INSERT INTO IMGTABLE VALUES(?,?)");
			)
		{
			
			pstmt.setString(1, "pic2");
			File imgFile=new File("D:/java_training/javapic.jfif");
			FileInputStream fis=new FileInputStream(imgFile);
			
			pstmt.setBinaryStream(2, fis);
			
			int rowsUpdated = pstmt.executeUpdate();
			System.out.println(rowsUpdated + " row(s) updated");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void retrieveImage()
	{
		try(
				BasicDataSource dataSource=customizeConnection(new BasicDataSource());
				Connection con=dataSource.getConnection();
				PreparedStatement pstmt2 =con.prepareStatement("SELECT * FROM IMGTABLE");
			)
		{
			ResultSet rs=pstmt2.executeQuery();
		
			while(rs.next())
			{
				 Blob b=rs.getBlob(2); 
				byte barr[]=b.getBytes(1,(int)b.length()); 
				FileOutputStream fos=new FileOutputStream("d:\\img2.jpg");
				
				fos.write(barr);
				fos.flush();
				fos.close();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) throws Exception  {
		
		//insertImage();
		retrieveImage();
		

	}

}

package com.practice.jdbc;

import java.sql.*;

public class TestPreparedStatement {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "admin"); 
		 
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM DEPARTMENT"); 
		ResultSet rs=pstmt.executeQuery();
		
		PreparedStatement pstmt2 = con.prepareStatement("INSERT INTO DEPARTMENTCOPY VALUES(?,?)");
		
		while(rs.next()) { 
			pstmt2.setInt(1, rs.getInt("DEPTID") ); 
			pstmt2.setString(2, rs.getString("DEPTNAME")); 
			System.out.println("success");
		}
		
		pstmt.close(); 
		pstmt2.close();
		
		con.close();


	}

}

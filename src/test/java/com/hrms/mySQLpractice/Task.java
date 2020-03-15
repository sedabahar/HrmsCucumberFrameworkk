package com.hrms.mySQLpractice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.collect.Multiset.Entry;

public class Task {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";

	// jdbc:type driver:host:post/name of the database

	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	
	@Test
	public void getJob() throws SQLException {
		

		List<String> all = new ArrayList<>();

		Connection co = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = co.createStatement();
		ResultSet rset = st.executeQuery("select * from hs_hr_employees where emp_number=3666");

		while (rset.next()) {

			all.add(rset.getString("emp_firstname"));
			all.add(rset.getString("emp_lastname"));
			all.add(rset.getString("emp_middle_name"));
			all.add(rset.getString("emp_number"));
			ResultSetMetaData resultData = rset.getMetaData();
			 String colName=resultData.getColumnName(1);
		}

		System.out.println(all);
	
	
		  Connection c=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	      Statement s=c.createStatement();
	      
	        
	     
	        ResultSetMetaData resultData = rset.getMetaData();
	        int cols=resultData.getColumnCount();
	        
	      
		
	       
        
    }}





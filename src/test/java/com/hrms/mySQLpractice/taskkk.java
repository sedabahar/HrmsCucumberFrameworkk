package com.hrms.mySQLpractice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class taskkk {
	
	String dbUsername = "syntax_hrm";
    String dbPassword = "syntaxhrm123";
    String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
    
    @Test
    public void getMetaData() throws SQLException {
        
        Connection c=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        
        DatabaseMetaData dbData=c.getMetaData();
        String dbname=dbData.getDatabaseProductName();
        String dbversion=dbData.getDatabaseProductVersion();
        
     
        
        Statement s=c.createStatement();
        ResultSet rset=s.executeQuery("select * from hs_hr_employees where emp_number=7751");
        ResultSetMetaData resultData = rset.getMetaData();
        int cols=resultData.getColumnCount();
         
         
            while(rset.next()) {
            	
	        	//Map<String,String>map=new LinkedHashMap<>();
	        	
	            for(int i=1; i<=cols; i++) {
	            	
	        	String key=resultData.getColumnName(i);
	        	String value;
	      	
	        	if(rset.getObject(i)!=(null) ) {
	        		value=rset.getObject(i).toString();
	        		
	        	System.out.println(key+"= "+value);
	        	//map.put(key, value);
	        	}
	        	else {
	        	
	        		System.out.println(key+"= null");
	        	
	        		//map.put(key,null);
	        		
	        	}
	            }
	        
	        }

}}
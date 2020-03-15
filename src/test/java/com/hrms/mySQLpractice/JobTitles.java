package com.hrms.mySQLpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JobTitles {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";

	// jdbc:type driver:host:post/name of the database

	String dbUrl = "jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";

	@Test
	public void getJob() throws SQLException {

		List<String> all = new ArrayList<>();

		Connection co = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = co.createStatement();
		ResultSet rset = st.executeQuery("select * from ohrm_job_title");

		while (rset.next()) {

			all.add(rset.getString("job_title"));
		}

		System.out.println(all);
	}
	

}

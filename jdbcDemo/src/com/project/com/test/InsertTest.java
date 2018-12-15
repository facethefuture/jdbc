package com.project.com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

import com.project.com.jdbcUtil.JdbcUtil;

public class InsertTest {
@Test
public void insert() throws Exception{
	Connection conn = JdbcUtil.getCon();
	Statement st = conn.createStatement();
	st.executeUpdate("INSERT INTO student (id,name,age) VALUES (21,'Í¿É½ºìºì',21)");
	
}
}
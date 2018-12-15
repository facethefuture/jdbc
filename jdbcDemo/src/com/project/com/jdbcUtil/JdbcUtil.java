package com.project.com.jdbcUtil;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcUtil {
	static Properties p = new Properties();
	static {
		try{
			
			InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
			p.load(inStream);
			Class.forName(p.getProperty("driverClassName"));
			System.out.println(p.getProperty("driverClassName"));
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getCon(){
		try{
			Connection conn = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			return conn;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}

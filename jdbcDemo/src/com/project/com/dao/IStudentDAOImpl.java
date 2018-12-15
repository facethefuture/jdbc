package com.project.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.com.domain.Student;



public class IStudentDAOImpl implements IStudentDAO{

	@Override
	public void save(Student stu){
		System.out.println(2222);
		Connection conn = null;
		Statement st = null;
		String sql = "INSERT INTO student (id,name,age) VALUES (" +stu.getId() + "," +"'" +stu.getName() +"'," +stu.getAge()+")" ;
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","admin");
			st = conn.createStatement();
			st.executeUpdate(sql);
			System.out.println(sql);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public void delete(Student stu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

}

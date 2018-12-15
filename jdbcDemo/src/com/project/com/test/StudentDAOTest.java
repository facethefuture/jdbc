package com.project.com.test;

import org.junit.Test;

import com.project.com.dao.IStudentDAOImpl;
import com.project.com.domain.Student;

public class StudentDAOTest {
	public static void main(String[] args){
		IStudentDAOImpl imple = new IStudentDAOImpl();
		for (int i=10;i<20;i++) {
//			st.executeUpdate("INSERT INTO student (id,name,age) VALUES (" + i+",'ÃÀÅ®'£¬20)");
			Student student = new Student((long) i,"Í¿É½ÑÅÑÅ",20);
			imple.save(student);
		}
	}
}
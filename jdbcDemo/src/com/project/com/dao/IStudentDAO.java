package com.project.com.dao;

import com.project.com.domain.Student;

public interface IStudentDAO {
	//保存学生信息
	public void save(Student stu);
	//删除学生信息
	public void delete(Student stu);
	//获取学生信息
	public Student get(Long id);
	//更新学生信息
	public Student update(Student stu);
}

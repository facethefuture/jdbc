package com.project.com.dao;

import com.project.com.domain.Student;

public interface IStudentDAO {
	//����ѧ����Ϣ
	public void save(Student stu);
	//ɾ��ѧ����Ϣ
	public void delete(Student stu);
	//��ȡѧ����Ϣ
	public Student get(Long id);
	//����ѧ����Ϣ
	public Student update(Student stu);
}

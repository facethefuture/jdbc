package com.project.com.domain;

public class Student {
	private String name;
	private Long id;
	private int age;
	public Student(Long id,String name,int age){
		this.id =id;
		this.name=name;
		this.age=age;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}

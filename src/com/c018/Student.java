package com.c018;
public class Student {
	private String name;
	private long id;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(){

	}
	public Student(String name,long id,int age){
		this.age=age;
		this.id=id;
		this.name=name;
	}
}

package com.inherit.model.vo;

public class Employee extends Person{
	
//	private String name;
//	private int age;
//	private char gender;
	private String department;
	private String job;
	private int salary;
	
	//ctrl+스페이스바: 기본 생성자
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//alt+s+a+g: 매개변수 생성자
	public Employee(String department, String job, int salary) {
		super();
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
		this.department = department;
		this.job = job;
		this.salary = salary;
	}

	//alt+s+r+a+r: getter/setter
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}

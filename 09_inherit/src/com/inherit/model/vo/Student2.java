package com.inherit.model.vo;

public class Student2 extends Person2{
	
	private int grade;
	private int group;
	private int number;
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}

	public Student2(String name, int age, String gender, int grade, int group, int number) {
		super(name, age, gender);
		this.grade = grade;
		this.group = group;
		this.number = number;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return getName()+" "+getName()+" "+getGender()+" "+grade+" "+group+" "+number;
	}

}

package com.inherit.model.vo;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return ""+name+" "+age+" "+gender;
	}
	
	
	
	
	
	//부모 메소드 지정 -> 객체 정보를 출력하는 메소드
	public void print() {
		System.out.println(name+" "+age+" "+gender);
	}

}

package com.inherit.model.vo;

import java.util.Objects;

public class Employee extends Person{
	
//	private String name;
//	private int age;
//	private String gender;
	private String department;
	private String job;
	private int salary;
	
	//ctrl+스페이스바: 기본 생성자
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//alt+s+a+g: 매개변수 생성자
	public Employee(String name, int age, String gender, String department,
			String job, int salary) {
		//super();
		super(name, age, gender);
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
	
	
	
	
	
	//객체의 정보를 출력하는 매소드 재정의하기
	//Person.print() 매소드 다시 정의해보자 -> 오버라이딩
	@Override//부모매소드에서 현재 선언한 매소드와 일치하는 매소드가 있는지 확인해줌
	public void print() {
		System.out.println(super.getName()+" "+super.getAge()+" "+
		super.getGender()+" "+department+" "+job+" "+salary);
		//super. 써주는 것은 해당 클래스 내부에 같은 이름이 있으면 부모 클래스의 변수라고 가리키기 위함
		//사실 여기선 생략해도 무방함
	}
	
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+getDepartment()+" "+
				getJob()+" "+getSalary();
	}
	
	@Override
	public boolean equals (Object obj) {
		if (obj instanceof Employee) {
			Employee e = (Employee)obj;
			if (super.getName().equals(e.getName()) &&
					department.equals(e.department) && job.equals(e.job)) {
				return true;
			}
		}
		return false;
	}
	
	//동등성 비교 시 주소값도 가상으로 동일하게 해주기
	//Object hashcode()매소드를 재정의해줌
	//hashcode(): 객체의 주소를 출력해주는 매소드
	//equals를 오버라이딩 하여 구현 시 hashcode 메소드까지 오버라이딩 해야 함
	@Override
	public int hashCode() {
		return Objects.hash(getName(),department,job);
	}
}

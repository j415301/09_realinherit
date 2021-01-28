package com.inherit.model.vo;

import java.util.Objects;

public class Employee extends Person{
	
//	private String name;
//	private int age;
//	private String gender;
	private String department;
	private String job;
	private int salary;
	
	//ctrl+�����̽���: �⺻ ������
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	//alt+s+a+g: �Ű����� ������
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
	
	
	
	
	
	//��ü�� ������ ����ϴ� �żҵ� �������ϱ�
	//Person.print() �żҵ� �ٽ� �����غ��� -> �������̵�
	@Override//�θ�żҵ忡�� ���� ������ �żҵ�� ��ġ�ϴ� �żҵ尡 �ִ��� Ȯ������
	public void print() {
		System.out.println(super.getName()+" "+super.getAge()+" "+
		super.getGender()+" "+department+" "+job+" "+salary);
		//super. ���ִ� ���� �ش� Ŭ���� ���ο� ���� �̸��� ������ �θ� Ŭ������ ������� ����Ű�� ����
		//��� ���⼱ �����ص� ������
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
	
	//��� �� �� �ּҰ��� �������� �����ϰ� ���ֱ�
	//Object hashcode()�żҵ带 ����������
	//hashcode(): ��ü�� �ּҸ� ������ִ� �żҵ�
	//equals�� �������̵� �Ͽ� ���� �� hashcode �޼ҵ���� �������̵� �ؾ� ��
	@Override
	public int hashCode() {
		return Objects.hash(getName(),department,job);
	}
}

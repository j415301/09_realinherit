package com.inherit.model.vo;

import java.util.Objects;

public class Student extends Person{
	//��: person, ��: student
	//student�� Person �ڵ� �����ͼ� ���ڴ�
	//����� �� ���� �� ���ĸ� ����
	//but object�� ��� ���� �ٰ� Ŭ�����̱� ������ ��� ��� ����
	
//	private String name;
//	private int age;
//	//private char gender;
//	private String gender;//ȣȯ���� ���� char to String ����
	private int grade;
	private int group;
	private int number;
	
	public Student() {}
	
	public Student(String name, int age, String gender,
			int grade, int group, int number) {
		//�ڽ� �����ڿ��� �θ� �����ڸ� ȣ���� �� ����
		//������ �θ�Ŭ������ ��Ī�ϴ� ����� -> super
		//super();//�θ��� ����Ʈ ������ ȣ��
		super(name, age, gender);//�θ��� �Ű����� ������ ȣ��
		//�ݵ�� �� �Ű��������� �� �������� �ְ� �����ؾ� ��
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
		this.grade = grade;
		this.group = group;
		this.number = number;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public String getGender () {
//		return gender;
//	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setGroup(int group) {
		this.group = group;
	}
	public int getGroup() {
		return group;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	
	
	
	
	//��� �굵 �������̵� �Ȱ���!!! => object�޼ҵ尡 overriding ��
	@Override
	public String toString() {
		//��ü�� ������ ����� �� ���
		//�θ��� ��������� ���������ڰ� private���� ����Ǿ� ������
		//����� �Ǿ� �־ ���������� �Ұ����ϴ� -> get/set�� �̿��ؾ� �Ѵ�
		return getName()+" "+getAge()+" "+getGender()+" "+getGrade()+" "+getGroup()
		+" "+getNumber();
		//Ŭ���� ���ο� ���� �������� ���� �θ� �� ��������� �����Ѵٸ� super. ���� ����
		//Ŭ���� ���ο� ���� �������� ������ super.setName() �̷��� ����� ��
	}
	
	
	
	
	
	//��ü�� ������ ����ϴ� �żҵ� �������ϱ�
	//Person.print() �żҵ� �ٽ� �����غ��� -> �������̵�
	@Override//�θ�żҵ忡�� ���� ������ �żҵ�� ��ġ�ϴ� �żҵ尡 �ִ��� Ȯ������
	public void print() {//����δ� �θ� �żҵ�� �����ϰ� �ۼ�
		System.out.println(super.getName()+" "+super.getAge()+" "+
		super.getGender()+" "+grade+" "+group+" "+number);
	}
	
	//��ü�� ���ϼ��� ���ϱ� ���ؼ��� Object�� equals�� �������̵��ؼ� ����
	//(String�� ��Ʈ�� Ŭ���� ���ο� equals�� �������̵� �Ǿ� �ֱ� ������ ����� �� �ִ� ����)
	@Override
	public boolean equals(Object obj) {
		//���� ���� ��ü�ϱ�, ���� � ������ �����ϴٰ� �Ǵ����� ����
		//boolean result = false;
		if (obj instanceof Student) {
			Student s = (Student)obj;
			if(super.getName().equals(s.getName())) {
				return true;
			}
		}
		return false;
	}//�ϴ� �̰� ���� �ܿ��!!!!!
	
	
}

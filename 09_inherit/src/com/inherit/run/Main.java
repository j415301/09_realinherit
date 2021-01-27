package com.inherit.run;

import java.util.Scanner;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		Employee e = new Employee();
		//Ŭ������ �⺻������ Object Ŭ������ ��ӹް� �ִ�.
		System.out.println(s.hashCode());//Object�� ������ �޼ҵ�!
		//hashCode(): �ּҰ� ȣ�� �޼ҵ�
		System.out.println(e.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.hashCode());
		
		//��Ӱ��踦 �����ϸ� �ڽ� Ŭ����(sub)�� �θ� Ŭ����(super)�� �������, �޼ҵ带 ����� �� ����
//		s.setDepartment("�ڹ��к�");
//		System.out.println(s.getDepartment());
//		
//		System.out.println(s.);
		
		String gender = s.getGender();
		
		//��ӹ��� Person�� �������, ����޼ҵ� �̿� ������
		Student s1 = new Student();
		s1.setName("������");
		s1.setAge(19);
		s1.setGender("����");
		s1.setGrade(1);
		s1.setGroup(3);
		s1.setNumber(9);
		
		System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getGender());
		System.out.println(s1.toString());
		
		e.setName("������");
		e.setAge(35);
		e.setGender("����");
		e.setDepartment("������");
		e.setJob("����");
		e.setSalary(10000);
		
		System.out.println(e.getName()+" "+e.getAge()+" "+e.getGender()+" "+
		e.getDepartment()+" "+e.getJob()+" "+e.getSalary());
		
		//�����ú��� �����͸� �ְ� �ʱ�ȭ�ϱ�
		Student s2 = new Student("������",27,"����",3,3,9);
		System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getGender()+" "+
				s2.getGroup()+" "+s2.getNumber());
		
	}

}

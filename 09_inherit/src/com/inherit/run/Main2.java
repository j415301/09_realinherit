package com.inherit.run;

import com.inherit.model.vo.Employee2;
import com.inherit.model.vo.Student2;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 s = new Student2();
		Employee2 e = new Employee2();
		
		Student2 s1 = new Student2();
		s1.setName("유병승");
		s1.setAge(19);
		s1.setGender("남자");
		s1.setGrade(1);
		s1.setGroup(3);
		s1.setNumber(9);
		
		System.out.println(s1.getName());
		System.out.println(s1.toString());
		
		e.setName("김태희");
		e.setAge(35);
		e.setGender("여자");
		e.setDepartment("연예부");
		e.setJob("연기");
		e.setSalary(10000);
		
		System.out.println(e.getName());
		System.out.println(e.toString());
		
		Student2 s2 = new Student2("최찬규",27,"남자",3,3,9);
		System.out.println(s2.getGrade());
	}

}

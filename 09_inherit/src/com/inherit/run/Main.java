package com.inherit.run;

import java.util.Scanner;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		Employee e = new Employee();
		//클래스는 기본적으로 Object 클래스를 상속받고 있다.
		System.out.println(s.hashCode());//Object가 선언한 메소드!
		//hashCode(): 주소값 호출 메소드
		System.out.println(e.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.hashCode());
		
		//상속관계를 설정하면 자식 클래스(sub)는 부모 클래스(super)의 멤버변수, 메소드를 사용할 수 있음
//		s.setDepartment("자바학부");
//		System.out.println(s.getDepartment());
//		
//		System.out.println(s.);
		
		String gender = s.getGender();
		
		//상속받은 Person의 멤버변수, 멤버메소드 이용 가능함
		Student s1 = new Student();
		s1.setName("유병승");
		s1.setAge(19);
		s1.setGender("남자");
		s1.setGrade(1);
		s1.setGroup(3);
		s1.setNumber(9);
		
		System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getGender());
		System.out.println(s1.toString());
		
		e.setName("김태희");
		e.setAge(35);
		e.setGender("여자");
		e.setDepartment("연예부");
		e.setJob("연기");
		e.setSalary(10000);
		
		System.out.println(e.getName()+" "+e.getAge()+" "+e.getGender()+" "+
		e.getDepartment()+" "+e.getJob()+" "+e.getSalary());
		
		//생성시부터 데이터를 넣고 초기화하기
		Student s2 = new Student("최찬규",27,"남자",3,3,9);
		System.out.println(s2.getName()+" "+s2.getAge()+" "+s2.getGender()+" "+
				s2.getGroup()+" "+s2.getNumber());
		
	}

}

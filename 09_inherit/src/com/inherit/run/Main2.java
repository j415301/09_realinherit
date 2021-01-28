package com.inherit.run;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("유병승", 19, "남", 1, 2, 3);
		Employee e = new Employee("김상현", 29, "남", "개발팀", "개발자", 100);
		
		s.print();// 객체의 정보를 출력하는 기능을 하는 매소드
		e.print();// 객체의 정보를 출력하는 기능을 하는 매소드
		
		System.out.println(s.toString());
		
		//참조형 자료형 변수는 변수를 호출했을 때 주소가 나와야 함
		//자바 내부에서 참조형 자료형 변수를 호출했을 때 Object 클래스의 toString() 매소드를
		//호출하게 되어 있음
		System.out.println(s);
		System.out.println(e);
		
		//객체의 동등성 비교하기
		Student bs = new Student("유병승", 19, "남", 1, 3, 1);
		Student sh = new Student("유병승", 19, "남", 1, 3, 1);
		System.out.println(bs.equals(sh));//객체 동등 비교에는 String과 똑같이 equals 사용
		System.out.println();
		
		//employee 객체의 동등성 비교를 구현하자
		//이름, 부서, 직책이 같으면 같은 직원으로 판단하자
		Employee e1 = new Employee("김상현",19,"남","개발팀","개발자",10000);
		Employee e2 = new Employee("김상현",19,"남","개발팀","대표",10000);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//hashcode overriding해서 출력시 각 객체 필드 값이 전부 같으면 같은 주소가 나오고
		//하나라도 다르면 다른 주소가 나옴
		
		if(e1.equals(e2)) {
			System.out.println("동일한 사원입니다.");
		} else {
			System.out.println("동일하지 않은 사원입니다.");
		}
	}

}

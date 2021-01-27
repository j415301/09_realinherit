package com.inherit.model.vo;

public class Student extends Person{
	//부: person, 모: student
	//student가 Person 코드 가져와서 쓰겠다
	//상속은 한 번에 한 개식만 가능
	//but object는 모든 것의 근간 클래스이기 때문에 계속 사용 가능
	
//	private String name;
//	private int age;
//	//private char gender;
//	private String gender;//호환성을 위해 char to String 변경
	private int grade;
	private int group;
	private int number;
	
	public Student() {}
	
	public Student(String name, int age, String gender,
			int grade, int group, int number) {
		//자식 생성자에서 부모 생성자를 호출할 수 있음
		//생성된 부모클래스를 지칭하는 예약어 -> super
		//super();//부모의 디폴트 생성자 호출
		super(name, age, gender);//부모의 매개변수 생성자 호출
		//반드시 내 매개변수에도 이 변수들이 있게 구성해야 함
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
	
	public String toString() {
		//객체의 정보를 출력할 때 사용
		//부모의 멤버변수의 접근제한자가 private으로 선언되어 있으면
		//상속이 되어 있어도 직접접근이 불가능하다 -> get/set을 이용해야 한다
		return getName()+" "+getAge()+" "+getGender()+" "+getGrade()+" "+getGroup()
		+" "+getNumber();
		//클래스 내부에 같은 변수명이 없고 부모에 그 멤버변수가 존재한다면 super. 생략 가능
		//클래스 내부에 같은 변수명이 있으면 super.setName() 이렇게 써줘야 함
	}

}

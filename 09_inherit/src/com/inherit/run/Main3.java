package com.inherit.run;

import com.inherit.model.vo.Cat;
import com.inherit.model.vo.Dog;

public class Main3 {
	
	public static void main(String[] args) {
		
		//Dog d = new Dog();//�⺻�����ڰ� ���� ������ ����
		Dog d1 = new Dog("�ǻ�",1,"����");
		//Cat c = new Cat();//�⺻�����ڰ� ���� ������ ����
		Cat c1 = new Cat("�߿���",2,"����̰�");
		
		System.out.println(d1.bark());
		System.out.println(c1.bark());
		
	}

}

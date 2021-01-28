package com.inherit.run;

import com.inherit.model.vo.Cat;
import com.inherit.model.vo.Dog;

public class Main3 {
	
	public static void main(String[] args) {
		
		//Dog d = new Dog();//기본생성자가 없기 때문에 에러
		Dog d1 = new Dog("뽀삐",1,"개과");
		//Cat c = new Cat();//기본생성자가 없기 때문에 에러
		Cat c1 = new Cat("야옹이",2,"고양이과");
		
		System.out.println(d1.bark());
		System.out.println(c1.bark());
		
	}

}

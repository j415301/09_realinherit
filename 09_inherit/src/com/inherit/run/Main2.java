package com.inherit.run;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("������", 19, "��", 1, 2, 3);
		Employee e = new Employee("�����", 29, "��", "������", "������", 100);
		
		s.print();// ��ü�� ������ ����ϴ� ����� �ϴ� �żҵ�
		e.print();// ��ü�� ������ ����ϴ� ����� �ϴ� �żҵ�
		
		System.out.println(s.toString());
		
		//������ �ڷ��� ������ ������ ȣ������ �� �ּҰ� ���;� ��
		//�ڹ� ���ο��� ������ �ڷ��� ������ ȣ������ �� Object Ŭ������ toString() �żҵ带
		//ȣ���ϰ� �Ǿ� ����
		System.out.println(s);
		System.out.println(e);
		
		//��ü�� ��� ���ϱ�
		Student bs = new Student("������", 19, "��", 1, 3, 1);
		Student sh = new Student("������", 19, "��", 1, 3, 1);
		System.out.println(bs.equals(sh));//��ü ���� �񱳿��� String�� �Ȱ��� equals ���
		System.out.println();
		
		//employee ��ü�� ��� �񱳸� ��������
		//�̸�, �μ�, ��å�� ������ ���� �������� �Ǵ�����
		Employee e1 = new Employee("�����",19,"��","������","������",10000);
		Employee e2 = new Employee("�����",19,"��","������","��ǥ",10000);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//hashcode overriding�ؼ� ��½� �� ��ü �ʵ� ���� ���� ������ ���� �ּҰ� ������
		//�ϳ��� �ٸ��� �ٸ� �ּҰ� ����
		
		if(e1.equals(e2)) {
			System.out.println("������ ����Դϴ�.");
		} else {
			System.out.println("�������� ���� ����Դϴ�.");
		}
	}

}

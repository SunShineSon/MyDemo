package com.demo.extend;

public class ClassA {

	static {
		System.out.println("1");
	}

	/**
	 * ����ղ����Ĺ��캯����ӵ�и�������ĳ�ʼ�����ݣ�
	 * �����ʼ����ʱ�������Ϥ�����ʼ�������ݣ����Ը���չ��캯������ִ��
	 */
	ClassA() {
		System.out.println("2");
	}

	ClassA(String name) {
		System.out.println(name);
	}
}

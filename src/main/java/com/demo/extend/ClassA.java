package com.demo.extend;

public class ClassA {

	static {
		System.out.println("1");
	}

	/**
	 * 父类空参数的构造函数会拥有父类自身的初始化数据，
	 * 子类初始化的时候必须或获悉父类初始化的数据，所以父类空构造函数必须执行
	 */
	ClassA() {
		System.out.println("2");
	}

	ClassA(String name) {
		System.out.println(name);
	}
}

package com.demo.classload;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		ClassLoaderDemo loader = new ClassLoaderDemo();
		ClassLoader cl = loader.getClass().getClassLoader();
		System.out.println(cl);

		ClassLoader parent = cl.getParent();
		System.out.println(parent);

		ClassLoader parentParent = parent.getParent();
		System.out.println(parentParent);

		ClassLoader c = ClassLoaderDemo.class.getClassLoader(); // 获取Test类的类加载器
		System.out.println(c);

		ClassLoader c1 = c.getParent(); // 获取c这个类加载器的父类加载器
		System.out.println(c1);

		ClassLoader c2 = c1.getParent();// 获取c1这个类加载器的父类加载器
		System.out.println(c2);

	}

}

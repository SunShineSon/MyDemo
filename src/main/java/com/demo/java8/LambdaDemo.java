package com.demo.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo implements Comparable<LambdaDemo> {

	private String name;
	private int age;

	LambdaDemo() {
	}

	LambdaDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(LambdaDemo o) {
		int i = this.getAge() - o.getAge();// 先按照年龄排序
		if (i == 0) {
			return this.name.compareTo(o.getName());// 如果年龄相等了再用分数进行排序
		}
		return i;
	}

	public static void main(String[] args) {
		LambdaDemo demo = new LambdaDemo();
		demo.sortMothed();

	}

	// 2.1、
	public void sortMothed3() {
		List<LambdaDemo> list = new ArrayList<LambdaDemo>();
		list.add(new LambdaDemo("Zoo", 13));
		list.add(new LambdaDemo("Kuke", 53));
		list.add(new LambdaDemo("Banane", 31));
		list.add(new LambdaDemo("Oacegen", 3));

		Collections.sort(list);
		list.forEach(e -> System.out.println(e));
	}

	// 1、传统方式排序
	public void sortMothed() {
		List<String> names1 = new ArrayList<String>();
		names1.add("Google ");
		names1.add("Runoob ");
		names1.add("Taobao ");
		names1.add("Baidu ");
		names1.add("Sina ");

		Collections.sort(names1, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		names1.forEach(e -> System.out.println(e));
	}

	// 2、java8新特性集合排序
	public void sortMothed2() {
		List<String> name = new ArrayList<String>();
		name.add("Google ");
		name.add("Runoob ");
		name.add("Taobao ");
		name.add("Baidu ");
		name.add("Sina ");
		Collections.sort(name, (s1, s2) -> s1.compareTo(s2));
		name.forEach(e -> System.out.println(e));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}

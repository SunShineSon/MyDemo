package com.demo.collection;

public class User {

	public int age;
	
	public User(int age){
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[age : " + age + "]";
	}
}

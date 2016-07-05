package com.demo.extend;

public class ClassB extends ClassA{
	static{
		System.out.println("A");
	}
	
	ClassB(){
		super("super B");
		System.out.println("B");
	}
	
	ClassB(String name){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ClassA ab = new ClassB("name");
	}
}

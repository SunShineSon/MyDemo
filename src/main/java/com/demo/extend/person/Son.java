package com.demo.extend.person;

public class Son extends Father {

	
	public String name = "son";
	
	public static void main(String[] args) {
		String b = "abc";
		String a = b.concat("def");
		String c = b + 1;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
	}
}

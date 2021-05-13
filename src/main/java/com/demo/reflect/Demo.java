package com.demo.reflect;

public class Demo {

	public static void main(String[] args) {
		System.out.println("修改内容需要add to project ");
        Demo demo = new Demo();
        Class<? extends Demo> aClass = demo.getClass();
        Class<Demo> demoClass = Demo.class;


    }

}

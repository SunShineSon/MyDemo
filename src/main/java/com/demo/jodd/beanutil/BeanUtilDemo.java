package com.demo.jodd.beanutil;

import jodd.bean.BeanUtil;

public class BeanUtilDemo {

	public static void main(String[] args) {
		BeanUtilDemo demo = new BeanUtilDemo();
		demo.test();
	}
	
	public void test(){
		Foo foo = new Foo();
	    BeanUtil.setDeclaredProperty(foo, "readOnly", "data");
	    System.out.println(BeanUtil.getDeclaredProperty(foo, "readOnly"));
	    
	    
	    
	}

}

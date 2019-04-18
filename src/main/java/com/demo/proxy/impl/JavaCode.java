package com.demo.proxy.impl;

import com.demo.proxy.inter.ICode;

public class JavaCode implements ICode {

	private String name;
	 
    public JavaCode(String name){
        this.name = name;
    }
    
	/**
	 * 接口实现
	 * 2017年9月5日 下午10:57:45
	 * author : guo
	 * (non-Javadoc)
	 * @see com.demo.proxy.inter.ICode#coding(java.lang.String)
	 */
	public String coding(String dealName) {
		System.out.println("Java 开发人员 " + name + ",开发方法：" + dealName);
		return "Java 开发人员 " + name + ",开发方法：" + dealName;
	}

}

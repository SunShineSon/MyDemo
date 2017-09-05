package com.demo.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.demo.proxy.inter.ICode;

public class CoderDynamicProxy implements InvocationHandler{
	
	//被代理的实例
	private ICode icode;
	
	public CoderDynamicProxy(ICode code){
		this.icode = code;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(System.currentTimeMillis());
		Object result = method.invoke(icode, args);
		System.out.println(System.currentTimeMillis());
		return result;
	}

}

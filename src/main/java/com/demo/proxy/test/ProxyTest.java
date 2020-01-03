package com.demo.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.demo.proxy.impl.JavaCode;
import com.demo.proxy.inter.ICode;
import com.demo.proxy.proxy.CoderDynamicProxy;

/**
 * 测试
 * @author guo
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		//代理对象
		ICode code = new JavaCode("guo");
		
		//创建中介类实例
		InvocationHandler handler = new CoderDynamicProxy(code);
		
		ClassLoader loader = handler.getClass().getClassLoader();
		
		//动态代理对象
		ICode coder = (ICode)Proxy.newProxyInstance(loader, code.getClass().getInterfaces(), handler);
		
		coder.coding("coding .....");
		
	}
}

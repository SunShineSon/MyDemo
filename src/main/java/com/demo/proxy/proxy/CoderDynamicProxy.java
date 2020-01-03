package com.demo.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import com.demo.proxy.inter.ICode;



/**
 * 代理对象
 * 2019年4月9日 下午2:51:10
 * 
 * @Author：郭
 * @Description： 
 *
 */
public class CoderDynamicProxy implements InvocationHandler{
	
	//被代理的实例
	private ICode icode;
	
	public CoderDynamicProxy(ICode code){
		this.icode = code;
	}

	/**
	 * 切面逻辑处理，例如：日志处理，记时处理等等
	 * 2019年4月9日 下午3:51:57
	 * @Author 郭
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 * @Description:
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(System.currentTimeMillis());
		Object result = method.invoke(icode, args);
		System.out.println(result);
		System.out.println(System.currentTimeMillis());
		return result;
	}
	

}

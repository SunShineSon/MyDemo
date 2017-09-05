package com.demo.singleton;

/**
 * 单例模式：饿汉式（线程同步、不同步）
 * @author guo
 *
 */
public class SingletonB {

	private static SingletonB instance = new SingletonB();

	private SingletonB(){}
	
	public static SingletonB getInstances(){
		return instance;
	}
}

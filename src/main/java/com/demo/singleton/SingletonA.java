package com.demo.singleton;

/**
 * 单例模式
 * @author guo
 *
 */
public class SingletonA {
	
	private static SingletonA instance;
	
	private SingletonA(){
		
	}   

	/**
	 * 单例模式，懒汉式
	 * author : guo
	 * 2017年8月19日 下午10:22:53
	 * @return
	 */
	public static synchronized SingletonA getInstances(){
		if(instance == null){
			instance = new SingletonA();
		}
		return instance;
		
	}
}

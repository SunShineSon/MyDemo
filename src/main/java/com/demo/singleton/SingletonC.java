package com.demo.singleton;

public class SingletonC {

	private static SingletonC instance = null;
	
	static{
		instance = new SingletonC();
	}

	private SingletonC(){}
	
	public static SingletonC getInstance(){
		return instance;
	}
}

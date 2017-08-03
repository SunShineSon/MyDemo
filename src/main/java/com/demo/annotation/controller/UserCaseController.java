package com.demo.annotation.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.annotation.inter.UserCase;
import com.demo.annotation.util.PasswordUtils;

public class UserCaseController {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 47, 48, 49, 50);
		useCase(list, PasswordUtils.class);
	}

	private static void useCase(List<Integer> list, Class<?> cl) {
		for(Method m : cl.getDeclaredMethods()){	
			UserCase uc = m.getAnnotation(UserCase.class);	//返回该程序元素上存在的所有注解。
			if(uc != null){
				System.out.println(" Fount User Case : " + uc.id() + ", " + uc.description());
				list.remove(new Integer(uc.id()));
			}
		}
		for (Integer i : list) {
			System.out.println("Warning : missing user case - " + i);
		}
	}
	
	
	
	
}

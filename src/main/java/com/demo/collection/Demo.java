package com.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void mainq(String[] args) {

		List<User> uList = new ArrayList<User>();
		
		for (int i = 0; i < 7; i++) {
			User user = new User(i);
			uList.add(user);
		}
		System.out.println(uList.size());
		
		List<List<User>> lists = new ArrayList<List<User>>();
		List<User> list = new ArrayList<User>();
		
		for (int i = 0; i < uList.size(); i++) {
			if(i % 3 == 0 && i != 0){
				lists.add(list);
				list.clear();
				list = new ArrayList<User>();
				list.add(uList.get(i));
			}else{
				list.add(uList.get(i));
			}
		}
		
		if(list.size() != 0){
			lists.add(list);
		}
		
		System.out.println(lists.size());
	}
	
	/**
	 * 剪切数组
	 * author : guo
	 * 2018年5月31日 下午11:05:39
	 * @param args
	 */
	public static void main(String[] args) {
		List<User> uList = new ArrayList<User>();
		
		for (int i = 0; i < 7; i++) {
			User user = new User(i);
			uList.add(user);
		}
		System.out.println(uList.size());
		
		List<List<User>> lists = new ArrayList<List<User>>();
		
		int size = 3;
		int page = uList.size() / size;
		if(page == 0){
			lists.add(uList);
		}else{
			for (int i = 0; i < page; i++) {
				lists.add(uList.subList(i * size, (i + 1) * size));
			}
			
			if(uList.size() % size != 0){
				lists.add(uList.subList(page * size , uList.size()));
			}
		}

		System.out.println(lists.size());
		
		
	}

}

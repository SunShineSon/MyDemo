package com.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		System.out.println("ok");
		//ArrayListDemo demo  = new ArrayListDemo();
		//demo.arrayListV();
	}

	private void arrayList(){
		List<Object> lists = new ArrayList<Object>();
		String a = "AAAAAAAAAAAAAAAA";
		int b = 111;
		StringBuffer stringBuffer = new StringBuffer("asdfghjkl");
		lists.add(a);
		lists.add(a);
		lists.add(b);
		lists.add(b);
		lists.add(b);
		
		lists.add(1, stringBuffer);
		
		for(Object list : lists){
			System.out.println(list.toString());
		}
	}
	private void arrayListV(){
		List<Object> lists = new ArrayList<Object>();
		int a = 1;
		int b = 2;
		int c = 3;
		
		lists.add(c);
		lists.add(a);
		lists.add(b);
		lists.add(c);
		lists.add(b);
		
		lists.add(1, a);
		
		for(Object list : lists){
			System.out.println(list.toString());
		}
	}
}

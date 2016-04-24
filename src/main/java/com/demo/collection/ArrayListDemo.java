package com.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayListDemo demo  = new ArrayListDemo();
		demo.arrayList();
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
}

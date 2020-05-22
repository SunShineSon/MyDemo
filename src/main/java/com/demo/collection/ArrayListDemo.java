package com.demo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayListDemo demo  = new ArrayListDemo();
		//demo.arrayListV();

		//3, sublist
		List<String> list = demo.createList();
		List<String> subList = list.subList(4, list.size()); //include begin but no end.
		demo.alert(subList);


	}

	private List<String> createList(){
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		return list;
	}

	private void alert(List<String> list){
		System.out.println("List :");
		for (String str : list) {
			System.out.println(str);
		}

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

		lists.subList(0, 100);
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

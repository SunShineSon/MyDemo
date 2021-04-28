package com.demo.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayListDemo demo  = new ArrayListDemo();
		//demo.arrayListV();

		//3, sublist
		//List<String> list = demo.createList();
		//List<String> subList = list.subList(4, list.size()); //include begin but no end.
		//demo.alert(subList);

		//4
		//List<String> list = demo.createList();
		//System.out.println(list.get(list.size() - 1));

		/*List<String> a = new ArrayList<String>();
		Vector<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();
		Vector<String> d = new List<String>();
		List<String> e = new Vector<String>();
		List<String> f = new List<String>();*/

		try{
			System.out.println(doStuff(args));
		}catch (Exception e){
			System.out.println("exc");
		}
		doStuff(args);


	}

	static int doStuff(String[] args){
		return Integer.parseInt(args[0]);
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

        Collections.sort(list);
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


	public void arrayMethod(){
	    //1.create function one
	    int[]  i = new int[4];

	    //2.create function two
        String[] str = new String[]{"a", "b"};

        //3.create function three
        String[] str2 = {"a", "b"};


    }
}

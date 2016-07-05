package com.demo.string;

import java.util.ArrayList;
import java.util.List;

public class MyStringSpilt {

	public static void main(String[] args) {
		
		String str = "ab:cd:eabc:adced:afga";
		String regex = ":";
		MyStringSpilt mySpilt = new MyStringSpilt();
		String[] array = mySpilt.mySpilt(str, regex);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public String[] mySpilt(String str, String regex) {
		List<String> list = new ArrayList<String>();
		while (str.indexOf(regex) != -1) {
			String part = str.substring(0, str.indexOf(regex));
			str = str.substring(str.indexOf(regex) + 1, str.length());
			list.add(part);
		}
		return (String[]) list.toArray(new String[list.size()]);
	}

}

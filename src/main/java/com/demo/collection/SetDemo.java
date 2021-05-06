package com.demo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		SetDemo demo = new SetDemo();
		demo.method();

	}

	private void setTest() {
		Set<Entry<String, Object>> set = new HashSet<Entry<String, Object>>();

	}

	void methodLinked(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
    }

	void method() {
		Set<String> set = new HashSet<String>();

		set.add("b");
		set.add("a");
		set.add("o");
		set.add("a");

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

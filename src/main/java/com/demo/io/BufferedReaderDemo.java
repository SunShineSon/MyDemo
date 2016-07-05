package com.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		BufferedReaderDemo demo = new BufferedReaderDemo();
		String path = "E:" + File.separator + "learn" + File.separator
				+ "BufferedWirter.java";
		try {
			List<String> list = demo.createList(path);
			int size = list.size();
			for (int i = 0; i < size; i++) {
				System.out.println(list.get(size - i - 1));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<String> createList(String path) throws IOException {
		FileReader reader = new FileReader(path);
		BufferedReader buffreader = new BufferedReader(reader);
		String s;
		List<String> list = new LinkedList<String>();
		while ((s = buffreader.readLine()) != null) {
			list.add(s);
		}
		return list;
	}
}

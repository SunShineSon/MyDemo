package com.demo.io;

import java.io.File;

public class Demo {

	public static void main(String[] args) {
		String path = "E:" + File.separator + "learn" + File.separator + "picture";
		File file = new File(path);
		Demo demo = new Demo();
		if (file.exists()) {
			demo.diGui(file.getPath());
		}
	}

	public void diGui(String path) {
		System.out.println(path);
		File file = new File(path);
		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			String pathIn = path + File.separator + list[i];
			File fileIn = new File(pathIn);
			if (fileIn.isDirectory()) {
				diGui(fileIn.getPath());
			} else {
				System.out.println(fileIn.getPath());
			}
		}
	}
	
	public void diGui(File file){
		File[] list = file.listFiles();
		
	}

}

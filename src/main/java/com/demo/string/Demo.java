package com.demo.string;

public class Demo {

	public static void main(String[] args) {
		//test
		// String str = "com.foss.user.plugin.mycodeois2.MyPlugin";
		// System.out.println(str.substring(str.lastIndexOf(".") + 1 ));
		String strK = "plugin_code.zip";
		String unZipFileName = strK.substring(0, strK.indexOf("."));
		System.out.println(unZipFileName);
	}

}

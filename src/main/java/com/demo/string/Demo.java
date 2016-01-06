package com.demo.string;


public class Demo {

	private static void strTest() {
		// String str = "com.foss.user.plugin.mycodeois2.MyPlugin";
		// System.out.println(str.substring(str.lastIndexOf(".") + 1 ));
		String strK = "plugin_code.zip";
		String unZipFileName = strK.substring(0, strK.indexOf("."));
		System.out.println(unZipFileName);
	}

	
	private void mothed(){
		String strK = "";
		String StrV = new String("");
		System.out.println(strK.equals(StrV));
		System.out.println(strK == StrV);
	}
	
	private void instanceofMothed(){
		String anObject = "1";
		Object strV = new String("1");
		
		System.out.println(anObject == strV);
		
		System.out.println(strV instanceof String);
		if (strV instanceof String) {
		    String anotherString = (String) strV ;
		    System.out.println(anObject.equals(strV));
		}
	}
	
	private void stringIndex(){
		String str = "012345678912a";
		int indexStr = str.indexOf("a");
		System.out.println(indexStr);
		System.out.println(str.indexOf("6", 0));
		
		System.out.println(str.lastIndexOf("2"));
		
	}
	
	private void stringSub(){
		String strK = new String("0123456789a");
		String strV = strK.substring(0, strK.length());
		System.out.println(strK == strV);
		byte[] bytes = strK.getBytes();
		
		String strByte = new String(bytes, 1, 4);
		String strW = "1234";
		System.out.println(strByte.equals(strW));
	}
	
	private void strCompareTo(){
		String strK = new String("abc");
		String strV = "aBC";
		System.out.println(strK.compareToIgnoreCase(strV));
		System.out.println(strK.equalsIgnoreCase(strV));
		System.out.println(strK.concat("AAAAAAA"));
	}
	
	private void strReplace(){
		String strK = new String("0123456789a67");
		System.out.println(strK.replace("67", "ab"));
		String strV = new String(" 0 123 ");
		System.out.println(strV.trim());
	}
	
	public static void main(String[] args) {
		Demo demo  = new Demo();
		demo.strReplace();
	}
}

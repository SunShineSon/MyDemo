package com.demo.basetype;

public class Quote {
	
	static void test(boolean test){
		test = !test;
		System.out.println("test :" + test);
	}


	private static void mothed() {
		boolean test = true;
		test(test);
		System.out.println("after :" + test);
	}
	
	
	private int court;
	static boolean b;
	public static void main(String[] args) {
		System.out.println(b);
	}


	private static void othed3() {
		Quote q = new Quote(99);
		System.out.println(q.court);
	}


	private static void mothed1() {
		StringBuffer str = new StringBuffer("ABC");
		testObect(str);
		System.out.println(str);
	}


	private static void testObect(StringBuffer str) {
		str.append("DEF");
		
	}

	Quote(int acount){
		court = acount;
	}
}

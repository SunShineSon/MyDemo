package com.demo.basetype;

public class Test {

	/**
	 */
	void mothed() {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
		}
		System.out.println(j);
	}

	void mothed1() {
		int a = 5;
		int b = 3;
		if (a == 1 + b++) {
			System.out.println(a);
			System.out.println(b);
		}
		/*
		 * if (!(a == b) && (a == 1 + b++)) { System.out.println(a);
		 * System.out.println(b);
		 * 
		 * }
		 */
	}

	void mothed2() {
		int i = 1;
		int j = 0;
		j = (++i) + (++i) + (i++);
	
		System.out.println(j);
		System.out.println(i);
	}
	
	void mothed3(){
		int i = 2;
		String str = "a";
		switch (i) {
		case 2:
			
			break;

		default:
			break;
		}
	}
	

	public static void main(String[] args) {
		Test t = new Test();
		t.mothed2();
	}
	
	
}

package com.demo.basetype;

public class IntDemo {
	static {
		int x = 5;
	}
	static int x, y;  

	public static void main(String[] args) {
		x--;	
		myMothed(); //x=1, y=0
		System.out.println(x + y++ + x);
	}

	public static void myMothed() {
		y = x++ + ++x;
		// y=-1 + 1 =0
		// x = 1
	}

}

/*
 * 
 */
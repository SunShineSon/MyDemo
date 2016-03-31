package com.demo.training;

public class Duck {

	public static void main(String[] args) {
		Duck duck = new Duck();
		System.out.println(duck.duck(2, 1));
	}

	public int duck(int num, int times) {
		if (times < 7) {
			num = 2 * (num + 1);
			times++;
			num = duck(num, times);
			return num;
		} else {
			return num;
		}

	}

}

package com.demo.random;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		
		
	}

	private static void mothed() {
		Random random = new Random(47);
		System.out.println(random.nextInt(10));

		Integer randomNum = random.nextInt(1000000000);

		String md5Num = randomNum.toString();
	}
}

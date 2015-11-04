package com.demo.random;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
Random random = new Random();
		
		Integer randomNum = random.nextInt(1000000000);
		
		String md5Num = randomNum.toString();
	}
}

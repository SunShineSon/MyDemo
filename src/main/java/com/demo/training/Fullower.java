package com.demo.training;

public class Fullower {

	public static void main(String[] args) {
		Fullower fullower = new Fullower();
		fullower.fullower();

	}

	public void fullower() {
		for (int i = 100; i < 1000; i++) {
			int first = i / 100;
			int second = (i - first * 100) / 10;
			int third = i - first * 100 - second * 10;
			if (i == (myPow(first) + myPow(second) + myPow(third))) {
				System.out.println(i);
			}
		}
	}

	public int myPow(int i) {
		return i * i * i;
	}
}

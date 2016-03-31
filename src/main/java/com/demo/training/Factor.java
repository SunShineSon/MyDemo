package com.demo.training;

public class Factor {

	public static void main(String[] args) {
		Factor factor = new Factor();
		factor.factor();
	}

	public void factor() {
		for (int i = 1; i < 1000; i++) {
			int factors = 0;
			for (int n = 1; n <= i; n++) {
				if (i % n == 0) {
					factors = factors + n;
				}
			}
			if ((factors - i) == i) {
				System.out.println(i);
			}
		}
	}

}

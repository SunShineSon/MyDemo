package com.demo.training;


public class PrimeNumber {

	/**
	 * 101-200之间的素数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		System.out.println(prime.prime());
	}

	public int prime() {
		int begin = 101;
		int end = 200;
		int num = 0;

		for (int i = begin; i < end; i++) {
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					break;
				} else {
					int befori = i - 1;
					if (n == befori) {
						System.out.println(i);
						num++;
					}
				}

			}
		}
		return num;
	}

}

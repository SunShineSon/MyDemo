package com.demo.training;

public class Sum {

	public static void main(String[] args) {
		Sum sum = new Sum();
		System.out.println(sum.multiply(5, 1));
	}

	/**
	 * 1+2+3+...+n
	 * 
	 * @param num
	 * @param times
	 * @return
	 */
	public int sum(int num, int sum) {
		if (num == 0) {
			return sum;
		} else {
			sum = sum + num;
			num--;
			return sum(num, sum);
		}

	}
	
	/**
	 * 1*2*3*...*n
	 * @param num
	 * @param sum
	 * @return
	 */
	public int multiply(int num, int sum) {
		if (num == 0) {
			return sum;
		} else {
			sum = sum * num;
			num--;
			return multiply(num, sum);
		}
		
	}
	


}

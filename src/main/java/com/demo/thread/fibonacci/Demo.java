package com.demo.thread.fibonacci;

public class Demo {
	public static void main(String[] args) {
		Demo demo = new Demo();
		int[] col = demo.createFibonacci(-20);
		for (int i = 0; i < col.length; i++) {
			System.out.println(col[i]);
		}
	}

	/**
	 * @param n
	 *            斐波那契数列个数
	 * @return
	 */
	public int[] createFibonacci(int n) {
		int[] col = new int[n];
		n = n - 1;
		col[0] = 0;
		if (n >= 2) {
			col[1] = 1;
			for (int i = 2; i <= n; i++) {
				col[i] = col[i - 1] + col[i - 2];
			}
		} else if (n == 1) {
			col[1] = 1;
		} else if (n < 0) {
			System.out.println("参数异常");
		}
		return col;
	}
}

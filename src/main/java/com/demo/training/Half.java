package com.demo.training;

public class Half {

	public static void main(String[] args) {
		Half half = new Half();
		half.half(100, 3);
	}

	public void half(int lenght, int times) {
		if (times > 0) {
			lenght = lenght / 2;
			times = times - 1;
			half(lenght, times);
		} else {
			System.out.println("高度：" + lenght );
		}
	}

}

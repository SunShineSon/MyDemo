package com.demo.thread.eached;

public class EachedEntry implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "运行：" + i);
		}
	}

}

package com.demo.thread;

public class Demo implements Runnable {
	private String name;
	private int ticket = 20;

	Demo(String name) {
		this.name = name;
	}

	public void run() {
		sellTicket();

		/*
		 * for (int i = 0; i < 5; i++) {
		 * System.out.println(Thread.currentThread().getName() + "运行：" + i); if
		 * (i == 2) { System.out.println("让出当前线程");
		 * Thread.currentThread().yield(); } }
		 */
	}

	public static void main(String[] args) {
		Demo A = new Demo("A");
		// Demo B = new Demo("B");
		Thread t1 = new Thread(A);
		Thread t2 = new Thread(A);
		t1.start();
		t2.start();
	}

	public synchronized void sellTicket() {
		for (int n = 0; n < 20; n++) {
			if (ticket > 0) {
				System.out.println(Thread.currentThread().getName() + ",正在卖票:"
						+ this.ticket--);
			}
		}
	}

}

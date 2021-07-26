package com.demo.thread;

public class ThreadDemo extends Thread {

	public void run(){
		System.out.println("extends thread!");
	}

	public static void main(String[] args) {
		ThreadDemo A = new ThreadDemo();
		Thread t1 = new Thread(A);
		t1.start();
	}
}

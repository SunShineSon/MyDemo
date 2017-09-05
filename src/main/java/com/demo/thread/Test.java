package com.demo.thread;

public class Test extends Thread{

	public static void main(String[] args) {
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}

	@Override
	public void run() {
		
		super.run();
	}
}

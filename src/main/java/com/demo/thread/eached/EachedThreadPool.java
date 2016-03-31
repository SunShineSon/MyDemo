package com.demo.thread.eached;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EachedThreadPool {

	public static void main(String[] args) {
//		ExecutorService exec = Executors.newCachedThreadPool();
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			exec.execute(new EachedEntry());
		}
		exec.shutdown();
	}
}

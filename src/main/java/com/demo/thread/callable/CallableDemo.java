package com.demo.thread.callable;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<>();

		//1.Executor has result thread method
		for (int i = 0; i < 3; i++) {
			Future<String> future = executorService.submit(new TaskWithResult(i));
			results.add(future);
		}
		for (Future<String> fs : results) {
			fs.isDone();
			try {
                System.out.println(fs.isDone());
				System.out.println(fs.get());

			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
        executorService.shutdown();

        //2.Have't result thread method
        executorService.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
	}
}

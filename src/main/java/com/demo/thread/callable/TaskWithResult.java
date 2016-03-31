package com.demo.thread.callable;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String>{
	private int id;

	TaskWithResult(int id) {
		this.id = id;
	}

	public String call() throws Exception {
		return "the task with result " + id;
	}
	

}

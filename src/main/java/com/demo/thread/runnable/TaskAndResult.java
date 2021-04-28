package com.demo.thread.runnable;

/**
 * @Author : Ada
 * @CreateTime : 4/22/2021 2:45 PM
 * @Description :
 **/
public class TaskAndResult implements Runnable {

    private int id;

    TaskAndResult(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task And Result : " + id);
    }
}

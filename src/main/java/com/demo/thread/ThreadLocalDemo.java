package com.demo.thread;

import java.text.SimpleDateFormat;

/**
 * @Author : Ada
 * @CreateTime : 4/22/2021 2:24 PM
 * @Description :
 **/
public class ThreadLocalDemo {

    public static void main(String[] args) {
        ThreadLocal<Integer> count = new ThreadLocal<>();
        ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<>();
        ThreadLocal<SimpleDateFormat> dateFormatThreadLocal1 = ThreadLocal.withInitial(() -> new SimpleDateFormat("mm:ss"));
    }

}

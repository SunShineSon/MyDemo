package com.demo.thread;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Optional;

/**
 * @Author : Ada
 * @CreateTime : 4/22/2021 2:24 PM
 * @Description :
 **/
public class ThreadLocalDemo {

    private static HashMap<String, String> map;


    public static void main(String[] args) {

        ThreadLocal<Integer> count = new ThreadLocal<>();
        ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<>();
        ThreadLocal<SimpleDateFormat> dateFormatThreadLocal1 = ThreadLocal.withInitial(() -> new SimpleDateFormat("mm:ss"));
        count.set(2);
        count.set(3);
        System.out.println(count.get());
        count.remove();
        Optional<HashMap> hashMap = Optional.ofNullable(map);
        Optional optional = Optional.of(map);

        System.out.println(count.get());
    }

}

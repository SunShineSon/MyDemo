package com.demo.exception;

import sun.reflect.annotation.ExceptionProxy;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/**
 * @Author : Ada
 * @CreateTime : 9/28/2020 5:54 PM
 * @Description :
 **/
public class ExceptionTest {

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        try {
            method();
        }catch (Exception e){
            //e.printStackTrace();
            throw new RunException(e.toString(), e.toString());
        }
    }

    public static void method() throws Exception{
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        System.out.println(list.get(1));
    }
}

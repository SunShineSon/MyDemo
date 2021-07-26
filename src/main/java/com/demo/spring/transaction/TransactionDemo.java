package com.demo.spring.transaction;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : Ada
 * @CreateTime : 4/19/2021 3:21 PM
 * @Description :
 **/
public class TransactionDemo {


    public static void main(String[] args) {

    }



    @Transactional(readOnly=true)
    public void method(){

    }
}

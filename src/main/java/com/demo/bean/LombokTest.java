package com.demo.bean;

/**
 * @Author : Ada
 * @CreateTime : 11/18/2020 3:09 PM
 * @Description :
 **/
public class LombokTest {

    public static void main(String[] args) {
        BeanScope bean = new BeanScope();
        if("ok".equals(bean.getName())){
            System.out.println("ok");
        }else {
            System.out.println("null exception");
        }
    }
}

package com.demo.bean;

/**
 * @Author : Ada
 * @CreateTime : 11/18/2020 3:09 PM
 * @Description :
 **/
public class LombokTest {

    public static void main(String[] args) {

        BeanScope bean = new BeanScope();
        if(bean.getName() == null){

            System.out.println("null");
        }


    }

    private static void validate(Integer number, String str){
        number = 11;
        str = "b";
    }
}

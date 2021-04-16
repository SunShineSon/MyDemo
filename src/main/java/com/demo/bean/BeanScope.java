package com.demo.bean;

import lombok.Data;

/**
 * @Author : Guanlan
 * @Time : 2019/5/6 15:46
 * @Description : spring bean初始化对象的作用域，
 * scope=singleton单例模式，
 * propotype每次调用创建新对象，
 * request模式web应用中request范围，
 * session模式web应用中session范围。
 *
 **/
@Data
public class BeanScope {

    private String name;

    private String sex;

    private long id;

    private void init(){
        System.out.println("init");
    }

    @Data
    public static class InnerBean{

        private String innerName;

        private String innerSex;

    }
}

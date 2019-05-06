package com.demo.classload;

/**
 * @Author : Guanlan
 * @Time : 11:38
 * @Description :
 * 1、对于静态字段，只有直接定义这个字段的类才会被初始化
 * https://www.cnblogs.com/ITtangtang/p/3978102.html
 *
 * 通过子类来调用父类的静态字段，只会触发父类的初始化,但是这是要看不同的虚拟机的不同实现。
 *
 **/
public class Init {
    public static void main(String[] args) {
        System.out.println(subClass.value);
    }

}

class superClass{
    public static int value = 1234;
    static {
        System.out.println("supper init");
    }

}

class subClass extends superClass{
    static {
        System.out.println("sub init !");
    }
}

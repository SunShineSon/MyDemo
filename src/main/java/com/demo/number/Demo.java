package com.demo.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author : Guoguanlan
 * @CreateTime : 2021/6/8 22:18
 * @Description :
 */
public class Demo {

    public static void main(String[] args) {
        int n = -180300;

        List<Integer> list = new ArrayList<>();

        String str = "" + Math.abs(n);
        int len = str.length();
        for (int i = 0; i <= len; i++){
            String str1 = "";
            if(i == 0){
                str1 = "5" + str;
            }else if(i == len){
                str1 = str + "5";
            }else {
                str1 = str.substring(0, i) + "5" + str.substring(i, len);
            }
            System.out.println(str1);

            list.add(new Integer(str1));
        }

        Collections.sort(list);
        System.out.println("result : " );

        if(n > 0){
            System.out.println(list.get(list.size() - 1));
        }else {
            System.out.println(-list.get(list.size() - 1));
        }

    }
}

package com.demo.string;

/**
 * @Author : Ada
 * @CreateTime : 11/23/2020 10:58 AM
 * @Description :
 **/
public class StringUtils {

    /**
     * is String is not null, ""," "
     * @return
     */
    public static boolean isNotNull(String str){
        if(str == null){
            return false;
        }else if("".equals(str) || "".equals(str.trim())){
            return false;
        }
        return true;
    }

    /**
     * is String is null
     * @param str
     * @return
     */
    public static boolean isNull(String str){
        if(!isNotNull(str)){
            return true;
        }else {
            return false;
        }
    }

}

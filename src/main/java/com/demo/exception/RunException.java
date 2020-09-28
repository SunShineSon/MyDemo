package com.demo.exception;

/**
 * @Author : Ada
 * @CreateTime : 9/28/2020 6:00 PM
 * @Description :
 **/
public class RunException extends RuntimeException {
    private String code;
    private String message;

    public RunException(String code, String message){
        super(message);
        this.code = code;
        this.message = message;
    }

}


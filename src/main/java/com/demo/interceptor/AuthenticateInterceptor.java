package com.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;

/**
 * @Author : Ada
 * @CreateTime : 5/13/2021 4:53 PM
 * @Description :
 **/
public class AuthenticateInterceptor implements HandlerInterceptor {

    //should not interceptor url
    private HashSet set = new HashSet<>();


    public AuthenticateInterceptor (){
        set.add("/test/login.do");

    }

    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception {
        //Specific Intercept Service
        return true;
    }

}

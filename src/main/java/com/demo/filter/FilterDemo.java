package com.demo.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @Author : Ada
 * @CreateTime : 5/14/2021 3:26 PM
 * @Description :
 **/
public class FilterDemo implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        //Deal with servlet request or servlet response
        filterChain.doFilter(servletRequest, servletResponse);  // To the next filter or servlet handle

    }

    @Override
    public void destroy() {

    }
}

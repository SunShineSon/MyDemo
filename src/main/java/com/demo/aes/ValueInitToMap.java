package com.demo.aes;

import org.springframework.beans.factory.InitializingBean;

import java.util.HashMap;

/**
 * @Author : Ada
 * @CreateTime : 11/29/2019 4:34 PM
 * @Description :
 **/
public class ValueInitToMap implements InitializingBean {

    private final HashMap<String, Object> map = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("ValueInitToMap InitializingBean");
        map.put("partner", "c4901e4f315b2dd799bcee27ce1d8f5e2f90520bfae435b505865c3af7b65272");

    }

}

package com.demo.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringUtil {

    private static String ctxName = "restful";

    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/" + ctxName + ".xml");

    /**
     * @Description: 获取bean
     * @date 2014年3月10日 下午4:27:24
     * @version 1.0
     *
     * @param beanName
     * @param clazz
     * @return
     */
    public static <T> T getBean(String beanName, Class<T> clazz) {
        return ctx.getBean(beanName, clazz);
    }

    /**
     * @Description: 获取bean
     * @date 2014年3月10日 下午4:28:00
     * @version 1.0
     *
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        return ctx.getBean(beanName);
    }

    public static void main(String[] args) throws Exception {

    }
}

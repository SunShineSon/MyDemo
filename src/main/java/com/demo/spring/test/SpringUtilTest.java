package com.demo.spring.test;

import com.demo.spring.util.SpringUtil;

/**
 * @date 2016年1月6日
 * @author foss
 *
 */
public class SpringUtilTest {

    public static void main(String[] args) {
    	
    	//通过spring注入方式初始化对象
    	SpringUtilTest adminAppImpl = SpringUtil.getBean("springUtilTest", SpringUtilTest.class);

	}

}

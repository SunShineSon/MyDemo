package com.demo.spring.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

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
    	/*BeanFactory beanFactory = new BeanFactory() {
			
			public boolean isTypeMatch(String name, Class<?> targetType)
					throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isSingleton(String name)
					throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			public boolean isPrototype(String name)
					throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return false;
			}
			
			public Class<?> getType(String name) throws NoSuchBeanDefinitionException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getBean(String name, Object... args) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T getBean(String name, Class<T> requiredType)
					throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public <T> T getBean(Class<T> requiredType) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public Object getBean(String name) throws BeansException {
				// TODO Auto-generated method stub
				return null;
			}
			
			public String[] getAliases(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			public boolean containsBean(String name) {
				// TODO Auto-generated method stub
				return false;
			}
		};*/

	}

}

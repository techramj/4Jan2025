package com.seed.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor  implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.postProcessBeforeInitialization called");
		if(bean instanceof Employee) {
			Employee emp = (Employee) bean;
			emp.setName(emp.getName().toUpperCase());
		}
		return bean ;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.postProcessAfterInitialization called");
		return bean;
	}
}

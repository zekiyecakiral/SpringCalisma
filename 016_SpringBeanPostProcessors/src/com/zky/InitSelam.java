package com.zky;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSelam implements BeanPostProcessor {
	public Object postProcessorsBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Başlatma öncesi : "+ beanName);
		return bean;
		
		

	}
	public Object postProcessorsAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Başlatma sonrası : "+ beanName);
		return bean;
		
		

	}

}

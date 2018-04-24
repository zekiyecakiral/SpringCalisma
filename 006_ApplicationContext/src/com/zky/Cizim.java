 package com.zky;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Cizim {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext( new String[] {"spring.xml"});
		
		/*
		 * * Bir projede birden cok Spring yapilandirma dosyalariyla calisma imkani saglar.
		ApplicationContext context = new ClassPathXmlApplicationContext( new String[] {"spring.xml",
		"spring2.xml",
		"spring3.xml",
		"spring4.xml"
		});
		  */
		
		//BeanFactory beanFactory = context;
		
		Ucgen ucgen = (Ucgen) applicationContext.getBean("ucgen");
		ucgen.ciz();
		
	
	}
	
}

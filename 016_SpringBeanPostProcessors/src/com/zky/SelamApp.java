package com.zky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam nesne1 = (Selam) context.getBean("selam");

		nesne1.setMesaj("Güzel goren güzel düşünür.");
		nesne1.goster();
		// ((AbstractApplicationContext) context).registerShutdownHook();
	}
}

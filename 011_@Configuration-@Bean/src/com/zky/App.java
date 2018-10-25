package com.zky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ISelam obj = (ISelam) context.getBean("selam");
		obj.mesajYaz("Güzel gören güzel düşünür.Güzel düşünen hayatından lezzet alır.");
	}

}

package com.zky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zky.config.MerkezAppConfig;

public class MerkezApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MerkezAppConfig.class);
		
		A aNesnesi = (A) context.getBean("beana");
		aNesnesi.yaz("Güzel gören, güzel düşünür.");
		
		
		B bNesnesi = (B) context.getBean("beanb");
		bNesnesi.yaz("Güzel düşünen, hayatından lezzet alır.");
	}

}

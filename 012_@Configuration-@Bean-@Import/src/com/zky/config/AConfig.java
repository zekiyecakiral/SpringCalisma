package com.zky.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zky.A;

@Configuration
public class AConfig {
	@Bean(name ="beana")
	public A yaz() {
		return new A();
	}

	
}

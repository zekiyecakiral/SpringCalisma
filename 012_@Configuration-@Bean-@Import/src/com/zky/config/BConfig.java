package com.zky.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zky.B;

@Configuration
public class BConfig {
	@Bean(name ="beanb")
	public B yaz() {
		return new B();
	}

	
}

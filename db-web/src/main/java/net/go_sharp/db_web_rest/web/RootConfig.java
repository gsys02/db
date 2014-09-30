package net.go_sharp.db_web_rest.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "net.go_sharp.db_web_rest.controller")
@PropertySource("classpath:web.properties")
@Import(WebMvcConfig.class)
public class RootConfig {

	public RootConfig() {
		System.out.println("ya");
	}

	@Bean
	public String ho() {
		String aa = "aaaaa";
		return aa;
	}

}
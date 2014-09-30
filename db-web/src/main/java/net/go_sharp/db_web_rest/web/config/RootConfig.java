package net.go_sharp.db_web_rest.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "net.go_sharp.db_web_rest.controller")
@PropertySource("classpath:web.properties")
class RootConfig {
	
	
}
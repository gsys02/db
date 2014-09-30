package net.go_sharp.db_web_rest.web.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private Environment env;
	
	@PostConstruct
	public void init() {
		System.out.println("sssssss"+env.getProperty("cas.callback"));
	}
}
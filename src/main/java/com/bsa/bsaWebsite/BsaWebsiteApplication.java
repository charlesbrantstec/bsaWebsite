package com.bsa.bsaWebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication
public class BsaWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsaWebsiteApplication.class, args);
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/bsaWebsite/assets/").addResourceLocations("classpath:/bsaWebsite/assets/");
	}

}

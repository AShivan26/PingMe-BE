package com.project.service.ping_me;

import com.project.service.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class PingMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingMeApplication.class, args);
	}

	@Bean
	public ApplicationConfig applicationConfig() {
		return new ApplicationConfig();
	}

}
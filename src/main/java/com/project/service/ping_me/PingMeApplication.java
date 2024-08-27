package com.project.service.ping_me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.project.service"})
@EntityScan(basePackages = "com.project.service")
@EnableJpaRepositories(basePackages = "com.project.service")
public class PingMeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingMeApplication.class, args);
	}

}
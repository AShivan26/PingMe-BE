package com.project.service.config;

import com.project.service.adapter.rest.PingMeLoginApiDelegateImpl;
import com.project.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = {"com.project.service"})
public class ApplicationConfig {

    @Bean
    public PingMeLoginApiDelegateImpl pingMeLoginApiDelegateImpl() {

        return new PingMeLoginApiDelegateImpl();
    }
}

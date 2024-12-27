package com.project.service.persistence;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final PasswordEncoder passwordEncoder;

    private final JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void initializeData() {
        String password1 = passwordEncoder.encode("secret1");
        String password2 = passwordEncoder.encode("secret2");
        String password3 = passwordEncoder.encode("secret3");

        String sql1 = "INSERT INTO person (id, name, password, online, email, profile) " +
                "VALUES ('50b35861-d3cd-40b2-8c3b-606b673e1e50', 'Michael', ?, false, 'test1@gmail.com', 'mscott_profile')";

        String sql2 = "INSERT INTO person (id, name, password, online, email, profile) " +
                "VALUES ('50b35861-d3cd-40b2-8c3b-606b673e1e51', 'Toby Flenderson', ?, true, 'test2@gmail.com', 'toby_profile')";

        String sql3 = "INSERT INTO person (id, name, password, online, email, profile) " +
                "VALUES ('50b35861-d3cd-40b2-8c3b-606b673e1e52', 'Andrew Bernard', ?, true, 'test3@gmail.com', 'andy_profile')";

        jdbcTemplate.update(sql1, password1);
        jdbcTemplate.update(sql2, password2);
        jdbcTemplate.update(sql3, password3);
    }

}

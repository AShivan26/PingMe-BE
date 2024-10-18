package com.project.service;

import com.project.service.ping_me.PingMeApplication;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = PingMeApplication.class) // Replace MyApplication with your main application class
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseUnitTest {
    static {
        System.setProperty("APPLICATION_NAME","PingMe");
        System.setProperty("SERVICE_IDENTITY_DISABLE","true");
        System.setProperty("spring.application.name","PingMe");
    }

    @BeforeEach
    public void setUp() {
    }
    @AfterEach
    public void clear() {
    }
}

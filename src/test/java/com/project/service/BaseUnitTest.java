package com.project.service;

import com.project.service.ping_me.PingMeApplication;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = PingMeApplication.class)
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseUnitTest {
    static {
        System.setProperty("APPLICATION_NAME","PingMe");
        System.setProperty("SERVICE_IDENTITY_DISABLE","true");
        System.setProperty("spring.application.name","PingMe");
    }

    @BeforeAll
    static void setUpBeforeAllClass() {
        System.out.println("@BeforeAll - executes before all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @AfterEach
    public void clear() {
        System.out.println("@AfterEach - executes after each test method in this class");
    }


    @AfterAll
    static void setUpAfterAllClass() {
        System.out.println("@AfterAll - executes after all");
    }
}

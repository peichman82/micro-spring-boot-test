package com.jab.microservices.integration;

import com.jab.microservices.MyService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MyServiceIntegrationTest {

    @Autowired
    private MyService myService;

    @Test
    @Ignore
    public void greet() {
        assertThat(myService.greet()).isEqualTo("Hello, World");
    }
}

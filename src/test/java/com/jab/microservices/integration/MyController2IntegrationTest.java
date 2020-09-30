package com.jab.microservices.integration;

import com.jab.microservices.MyController2;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyController2IntegrationTest {

    @Autowired
    private MyController2 myController2;

    @Test
    @Ignore
    public void greetingTest() {
        assertThat(myController2.greeting()).isEqualTo("Hello, World");
    }
}

package com.jab.microservices.integration;

import com.jab.microservices.MyApplication;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyApplicationIntegrationTest {

    @Autowired
    private MyApplication myApplication;

    @Test
    @Ignore
    public void contextLoads() {
        assertThat(myApplication).isNotNull();
    }
}

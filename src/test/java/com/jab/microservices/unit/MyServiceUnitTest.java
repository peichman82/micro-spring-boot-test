package com.jab.microservices.unit;

import com.jab.microservices.MyService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyServiceUnitTest {

    private MyService myService;

    @Test
    public void greet() {
        myService = new MyService();

        assertThat(myService.greet()).isEqualTo("Hello, World");
    }
}

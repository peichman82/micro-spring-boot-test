package com.jab.microservices.unit;

import com.jab.microservices.MyController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MyControllerUnitTest {

    private MyController myController;

    @Test
    public void greetingTest() {
        myController = new MyController();

        assertThat(myController.greeting()).isEqualTo("Hello, World");
    }
}

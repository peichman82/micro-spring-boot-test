package com.jab.microservices.unit;

import com.jab.microservices.MyController2;
import com.jab.microservices.MyService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
class MyController2UnitTest {

    @Mock
    private MyService myService;

    @InjectMocks
    private MyController2 myController2;

    @Test
    public void greetingTest() {
        Mockito.when(myService.greet()).thenReturn("Hello, World");

        String response = myController2.greeting();

        verify(myService, times(1)).greet();
        assertThat(response).isEqualTo("Hello, World");
    }
}

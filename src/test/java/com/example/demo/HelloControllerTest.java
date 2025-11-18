package com.example.demo;

import com.example.demo.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    private final HelloController controller = new HelloController();

    @Test
    void testHello() {
        String response = controller.sayHello();
        assertThat(response).isEqualTo("Hello CI/CD!");
    }
}

package com.example.springunittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController helloController = new HelloController();
        String name = "Sean";
        assertEquals("Hello " + name, helloController.hello(name));
    }
}
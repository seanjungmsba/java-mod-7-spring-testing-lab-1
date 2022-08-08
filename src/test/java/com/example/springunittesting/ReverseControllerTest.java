package com.example.springunittesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseControllerTest {

    @Test
    void reverse() {
        ReverseController reverseController = new ReverseController();
        String name = "Sean";
        assertEquals("naeS", reverseController.reverse(name));
    }
}
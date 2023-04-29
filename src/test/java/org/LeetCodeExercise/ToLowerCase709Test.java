package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerCase709Test {

    @Test
    void toLowerCase() {
        ToLowerCase709 tlc = new ToLowerCase709();
        String result = tlc.toLowerCase("HeLLO");
        assertEquals("hello", result );


    }
}
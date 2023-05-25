package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ToLowerCase709;
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
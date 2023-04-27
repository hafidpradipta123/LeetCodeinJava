package org.example;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    @org.junit.jupiter.api.Test
    void generate() {
        PascalTriangle subject = new PascalTriangle();

        List result = subject.generate(5);
        assertEquals(5, result.size());
    }
}
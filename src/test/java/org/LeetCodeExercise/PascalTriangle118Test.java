package org.LeetCodeExercise;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangle118Test {

    @org.junit.jupiter.api.Test
    void generate() {
        PascalTriangle118 subject = new PascalTriangle118();

        List result = subject.generate(5);
        assertEquals(5, result.size());
    }
}
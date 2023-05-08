package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationofArray1929Test {

    @Test
    void getConcatenation() {

        ConcatenationofArray1929 formula = new ConcatenationofArray1929();
        int [] input = {1,3,2,1};
        int [] result = formula.getConcatenation(input);
        int [] expected = {1,3,2,1,1,3,2,1};
        assertArrayEquals(expected, result);
    }
}
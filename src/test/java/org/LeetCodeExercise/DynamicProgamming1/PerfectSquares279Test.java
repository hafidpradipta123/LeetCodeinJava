package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquares279Test {

    @Test
    public void testNumSquares() {
        PerfectSquares279 perfectSquares = new PerfectSquares279();

        // Test case 1: n = 12
        int n1 = 12;
        int expected1 = 3;
        int actual1 = perfectSquares.numSquares(n1);
        Assertions.assertEquals(expected1, actual1);

        // Test case 2: n = 13
        int n2 = 13;
        int expected2 = 2;
        int actual2 = perfectSquares.numSquares(n2);
        Assertions.assertEquals(expected2, actual2);

        // Test case 3: n = 1
        int n3 = 1;
        int expected3 = 1;
        int actual3 = perfectSquares.numSquares(n3);
        Assertions.assertEquals(expected3, actual3);

        // Test case 4: n = 0
        int n4 = 0;
        int expected4 = 0;
        int actual4 = perfectSquares.numSquares(n4);
        Assertions.assertEquals(expected4, actual4);

        // Test case 5: n = 9999
        int n5 = 9999;
        int expected5 = 4;
        int actual5 = perfectSquares.numSquares(n5);
        Assertions.assertEquals(expected5, actual5);
    }

}
package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareSortedArray977Test {

    @Test
    void sortedSquares() {
        SquareSortedArray977 ss = new SquareSortedArray977();
        int [] input = {-4,1,0,3,10};
        int [] expected = {0,1,9,16,100};
        int[] output = ss.sortedSquares(input);
        assertArrayEquals(expected,output );
    }
}
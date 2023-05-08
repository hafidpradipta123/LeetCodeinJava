package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReshapeMatrix566Test {

    @Test
    void matrixReshape() {
        int [][] nums = {{1,2},
                        {3,4},
                        {5,6}};
        int r = 1;
        int c = 6;
        ReshapeMatrix566 formula = new ReshapeMatrix566();
        int[][] output = formula.matrixReshape(nums, r, c);
        int[][] expected = {{1,2,3,4,5,6}};
        assertArrayEquals(expected, output);
    }

    @Test
    void matrixReshape2() {
        int [][] nums = {{1,2},{3,4}};
        int r = 2;
        int c = 4;
        ReshapeMatrix566 formula = new ReshapeMatrix566();
        int[][] output = formula.matrixReshape(nums, r, c);
        int[][] expected = {{1,2},{3,4}};
        assertArrayEquals(expected, output);
    }
}
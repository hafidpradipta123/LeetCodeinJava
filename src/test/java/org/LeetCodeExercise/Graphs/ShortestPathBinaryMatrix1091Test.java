package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathBinaryMatrix1091Test {
    @Test
    public void testShortestPathBinaryMatrix() {
        // Create an instance of the class
        ShortestPathBinaryMatrix1091 spbm = new ShortestPathBinaryMatrix1091();

        // Test case 1: Grid with a valid path
        int[][] grid1 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int expected1 = 4;
        int result1 = spbm.shortestPathBinaryMatrix(grid1);
        Assertions.assertEquals(expected1, result1);

        // Test case 2: Grid with no valid path
        int[][] grid2 = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };
        int expected2 = -1;
        int result2 = spbm.shortestPathBinaryMatrix(grid2);
        Assertions.assertEquals(expected2, result2);

        // Test case 3: Empty grid
        int[][] grid3 = {};
        int expected3 = -1;
        int result3 = spbm.shortestPathBinaryMatrix(grid3);
        Assertions.assertEquals(expected3, result3);

        // Test case 4: Grid with only one cell
        int[][] grid4 = {{0}};
        int expected4 = 1;
        int result4 = spbm.shortestPathBinaryMatrix(grid4);
        Assertions.assertEquals(expected4, result4);
    }
}
package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestBridge934Test {
    @Test
    public void testShortestBridge() {
        ShortestBridge934.Solution solution = new ShortestBridge934().new Solution();

        // Test Case 1
        int[][] grid1 = {
                {0, 1},
                {1, 0}
        };
        assertEquals(1, solution.shortestBridge(grid1));

        // Test Case 2
        int[][] grid2 = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 0, 1}
        };
        assertEquals(3, solution.shortestBridge(grid2));

        // Test Case 3
        int[][] grid3 = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };
        assertEquals(1, solution.shortestBridge(grid3));

        // Test Case 4
        int[][] grid4 = {
                {0, 0, 1, 1, 1},
                {0, 1, 1, 0, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1}
        };
        assertEquals(2, solution.shortestBridge(grid4));
    }
}
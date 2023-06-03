package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaIsland695Test {
    @Test
    public void testMaxAreaOfIsland() {
        MaxAreaIsland695 maxAreaIsland = new MaxAreaIsland695();

        // Test case 1: grid with multiple islands
        int[][] grid1 = {
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1}
        };
        int expected1 = 6;
        int result1 = maxAreaIsland.maxAreaOfIsland(grid1);
        assertEquals(expected1, result1);

        // Test case 2: grid with a single island
        int[][] grid2 = {
                {0, 1, 0, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1}
        };
        int expected2 = 9;
        int result2 = maxAreaIsland.maxAreaOfIsland(grid2);
        assertEquals(expected2, result2);

        // Test case 3: grid with no islands
        int[][] grid3 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int expected3 = 0;
        int result3 = maxAreaIsland.maxAreaOfIsland(grid3);
        assertEquals(expected3, result3);

        // Test case 4: grid with all islands
        int[][] grid4 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int expected4 = 9;
        int result4 = maxAreaIsland.maxAreaOfIsland(grid4);
        assertEquals(expected4, result4);
    }

}
package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RottingOranges994Test {
    @Test
    public void testOrangesRotting() {
        RottingOranges994 rottingOranges = new RottingOranges994();

        int[][] grid1 = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        int expected1 = 4;
        int result1 = rottingOranges.orangesRotting(grid1);
        Assertions.assertEquals(expected1, result1);

        int[][] grid2 = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        int expected2 = -1;
        int result2 = rottingOranges.orangesRotting(grid2);
        Assertions.assertEquals(expected2, result2);

        int[][] grid3 = {
                {0, 2}
        };
        int expected3 = 0;
        int result3 = rottingOranges.orangesRotting(grid3);
        Assertions.assertEquals(expected3, result3);

        // Add more test cases as needed
    }
}
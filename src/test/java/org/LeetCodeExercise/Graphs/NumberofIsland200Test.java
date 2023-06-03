package org.LeetCodeExercise.Graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberofIsland200Test {
    @Test
    public void testNumIslands() {
        NumberofIsland200 solution = new NumberofIsland200();

        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int count1 = solution.numIslands(grid1);
        Assert.assertEquals(1, count1);

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int count2 = solution.numIslands(grid2);
        Assert.assertEquals(3, count2);

        char[][] grid3 = {
                {'1', '0', '1', '0', '1'},
                {'0', '1', '0', '1', '0'},
                {'1', '0', '1', '0', '1'},
                {'0', '1', '0', '1', '0'}
        };
        int count3 = solution.numIslands(grid3);
        Assert.assertEquals(16, count3);
    }

}
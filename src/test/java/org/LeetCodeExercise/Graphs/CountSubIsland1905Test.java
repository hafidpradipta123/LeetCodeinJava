package org.LeetCodeExercise.Graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSubIsland1905Test {
    @Test
    public void testCountSubIslands() {
        CountSubIsland1905 countSubIsland1905 = new CountSubIsland1905();

        int[][] grid1 = {
                {1, 1, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        int[][] grid2 = {
                {1, 1, 1},
                {0, 0, 1},
                {1, 1, 0}
        };

        int expected = 1;
        int actual = countSubIsland1905.countSubIslands(grid1, grid2);

        Assert.assertEquals(expected, actual);
    }

}
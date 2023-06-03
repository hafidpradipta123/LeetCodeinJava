package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandPerimeter463Test {
    @Test
    void islandPerimeter() {
        IslandPerimeter463 solution = new IslandPerimeter463();

        // Test case 1: Island with perimeter 16
        int[][] grid1 = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        int expected1 = 16;
        int result1 = solution.islandPerimeter(grid1);
        Assertions.assertEquals(expected1, result1);

        // Test case 2: Island with perimeter 4
        int[][] grid2 = {
                {1}
        };
        int expected2 = 4;
        int result2 = solution.islandPerimeter(grid2);
        Assertions.assertEquals(expected2, result2);

        // Test case 3: No island, perimeter 0
        int[][] grid3 = {
                {0, 0},
                {0, 0}
        };
        int expected3 = 0;
        int result3 = solution.islandPerimeter(grid3);
        Assertions.assertEquals(expected3, result3);
    }

}
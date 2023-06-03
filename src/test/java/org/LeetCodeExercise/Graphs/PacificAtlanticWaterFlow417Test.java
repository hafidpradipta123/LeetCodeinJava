package org.LeetCodeExercise.Graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PacificAtlanticWaterFlow417Test {
    @Test
    public void testPacificAtlantic() {
        PacificAtlanticWaterFlow417 solution = new PacificAtlanticWaterFlow417();

        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 4));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(3, 0));
        expected.add(Arrays.asList(3, 1));
        expected.add(Arrays.asList(4, 0));

        List<List<Integer>> result = solution.pacificAtlantic(heights);

        Assert.assertEquals(expected, result);
    }

}
package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Subsets78Test {

    @Test
    public void subsetsTest() {
        Subsets78 subsets78 = new Subsets78();

        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(2, 3),
                Arrays.asList(1, 2, 3)
        );

        List<List<Integer>> result = subsets78.subsets(nums);
        assertEquals(expected, result);
    }

}
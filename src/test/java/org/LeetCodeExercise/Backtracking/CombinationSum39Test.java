package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum39Test {
    @Test
    void combinationSumTest() {
        CombinationSum39 combinationSum39 = new CombinationSum39();

        // Test Case 1
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(2, 2, 3),
                Arrays.asList(7)
        );
        List<List<Integer>> result1 = combinationSum39.combinationSum(candidates1, target1);
        assertEquals(expected1, result1);

        // Test Case 2
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(2, 2, 2, 2),
                Arrays.asList(2, 3, 3),
                Arrays.asList(3, 5)
        );
        List<List<Integer>> result2 = combinationSum39.combinationSum(candidates2, target2);
        assertEquals(expected2, result2);

        // Test Case 3
        int[] candidates3 = {1};
        int target3 = 2;
        List<List<Integer>> expected3 = Arrays.asList(
                Arrays.asList(1, 1)
        );
        List<List<Integer>> result3 = combinationSum39.combinationSum(candidates3, target3);
        assertEquals(expected3, result3);
    }

}
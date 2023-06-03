package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumII40Test {
    @Test
    public void testCombinationSum2() {
    CombinationSumII40 combinationSumII40 = new CombinationSumII40();

    // Test Case 1
    int[] candidates1 = {10, 1, 2, 7, 6, 1, 5};
    int target1 = 8;
    List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1, 1, 6));
        expected1.add(Arrays.asList(1, 2, 5));
        expected1.add(Arrays.asList(1, 7));
        expected1.add(Arrays.asList(2, 6));
        Assertions.assertEquals(expected1, combinationSumII40.combinationSum2(candidates1, target1));

    // Test Case 2
    int[] candidates2 = {2, 5, 2, 1, 2};
    int target2 = 5;
    List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(1, 2, 2));
        expected2.add(Arrays.asList(5));
        Assertions.assertEquals(expected2, combinationSumII40.combinationSum2(candidates2, target2));

    // Test Case 3 (Edge Case)
    int[] candidates3 = {2, 2, 2};
    int target3 = 1;
    List<List<Integer>> expected3 = new ArrayList<>();
        Assertions.assertEquals(expected3, combinationSumII40.combinationSum2(candidates3, target3));
}

}
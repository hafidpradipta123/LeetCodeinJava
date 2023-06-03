package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsII47Test {
    @Test
    public void testPermuteUnique() {
        PermutationsII47.Solution solution = new PermutationsII47().new Solution();

        // Test case 1: Input array with no duplicates
        int[] nums1 = {1, 2, 3};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );
        List<List<Integer>> result1 = solution.permuteUnique(nums1);
        assertEquals(expected1, result1);

        // Test case 2: Input array with duplicates
        int[] nums2 = {1, 1, 2};
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(1, 1, 2),
                Arrays.asList(1, 2, 1),
                Arrays.asList(2, 1, 1)
        );
        List<List<Integer>> result2 = solution.permuteUnique(nums2);
        assertEquals(expected2, result2);

        // Test case 3: Input array with no elements
        int[] nums3 = {};
        List<List<Integer>> expected3 = Arrays.asList(
                new ArrayList<>()
        );
        List<List<Integer>> result3 = solution.permuteUnique(nums3);
        assertEquals(expected3, result3);
    }

}
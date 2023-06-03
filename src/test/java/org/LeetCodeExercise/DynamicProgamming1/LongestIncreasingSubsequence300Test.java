package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequence300Test {
    @Test
    public void testLengthOfLIS() {
        LongestIncreasingSubsequence300 solution = new LongestIncreasingSubsequence300();

        // Test case 1: Example from the problem description
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected1 = 4;
        int result1 = solution.lengthOfLIS(nums1);
        Assert.assertEquals(expected1, result1);

        // Test case 2: All elements are the same
        int[] nums2 = {1, 1, 1, 1, 1};
        int expected2 = 1;
        int result2 = solution.lengthOfLIS(nums2);
        Assert.assertEquals(expected2, result2);

        // Test case 3: Empty array
        int[] nums3 = {};
        int expected3 = 0;
        int result3 = solution.lengthOfLIS(nums3);
        Assert.assertEquals(expected3, result3);

        // Test case 4: Array with only one element
        int[] nums4 = {5};
        int expected4 = 1;
        int result4 = solution.lengthOfLIS(nums4);
        Assert.assertEquals(expected4, result4);

        // Test case 5: Array with all elements in descending order
        int[] nums5 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int expected5 = 1;
        int result5 = solution.lengthOfLIS(nums5);
        Assert.assertEquals(expected5, result5);

        // Test case 6: Array with all elements in ascending order
        int[] nums6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected6 = 9;
        int result6 = solution.lengthOfLIS(nums6);
        Assert.assertEquals(expected6, result6);

        // Test case 7: Array with negative and positive numbers
        int[] nums7 = {0, -1, 2, -3, 4, -5, 6};
        int expected7 = 4;
        int result7 = solution.lengthOfLIS(nums7);
        Assert.assertEquals(expected7, result7);
    }
}
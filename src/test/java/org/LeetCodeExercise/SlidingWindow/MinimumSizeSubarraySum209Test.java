package org.LeetCodeExercise.SlidingWindow;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySum209Test {

    @Test
    void minSubarrayLen() {
        MinimumSizeSubarraySum209 solution = new MinimumSizeSubarraySum209();

        // Test case 1: Valid subarray with sum >= s
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int s1 = 7;
        int expected1 = 2;
        int result1 = solution.minSubarrayLen(s1, nums1);
        Assert.assertEquals(expected1, result1);

        // Test case 2: No valid subarray with sum >= s
        int[] nums2 = {1, 2, 3, 4, 5};
        int s2 = 11;
        int expected2 = 0;
        int result2 = solution.minSubarrayLen(s2, nums2);
        Assert.assertEquals(expected2, result2);

        // Test case 3: Empty array
        int[] nums3 = {};
        int s3 = 5;
        int expected3 = 0;
        int result3 = solution.minSubarrayLen(s3, nums3);
        Assert.assertEquals(expected3, result3);

        // Test case 4: Single element in array equal to s
        int[] nums4 = {5};
        int s4 = 5;
        int expected4 = 1;
        int result4 = solution.minSubarrayLen(s4, nums4);
        Assert.assertEquals(expected4, result4);

        // Test case 5: Single element in array less than s
        int[] nums5 = {2};
        int s5 = 5;
        int expected5 = 0;
        int result5 = solution.minSubarrayLen(s5, nums5);
        Assert.assertEquals(expected5, result5);
    }
}
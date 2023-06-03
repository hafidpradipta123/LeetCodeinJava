package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarray152Test {
    @Test
    public void testMaxProduct() {
        MaximumProductSubarray152 solution = new MaximumProductSubarray152();

        // Test case 1: Regular array with positive and negative numbers
        int[] nums1 = {2, 3, -2, 4};
        int expected1 = 6;
        int result1 = solution.maxProduct(nums1);
        Assert.assertEquals(expected1, result1);

        // Test case 2: Array with only one element
        int[] nums2 = {5};
        int expected2 = 5;
        int result2 = solution.maxProduct(nums2);
        Assert.assertEquals(expected2, result2);

        // Test case 3: Array with all negative numbers
        int[] nums3 = {-2, -3, -1, -4, -2};
        int expected3 = 48;
        int result3 = solution.maxProduct(nums3);
        Assert.assertEquals(expected3, result3);

        // Test case 4: Array with all positive numbers
        int[] nums4 = {1, 2, 3, 4, 5};
        int expected4 = 120;
        int result4 = solution.maxProduct(nums4);
        Assert.assertEquals(expected4, result4);
    }

}
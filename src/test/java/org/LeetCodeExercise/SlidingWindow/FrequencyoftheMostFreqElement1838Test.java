package org.LeetCodeExercise.SlidingWindow;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyoftheMostFreqElement1838Test {
    @Test
    public void testMaxFrequency() {
        FrequencyoftheMostFreqElement1838 solution = new FrequencyoftheMostFreqElement1838();
        // Test case 1
        int[] nums1 = {1,1,1,2,2, 4};
        int k1 = 2;
        int expected1 = 4;
        int result1 = solution.maxFrequency(nums1, k1);
        Assert.assertEquals(expected1, result1);

        // Test case 2
        int[] nums2 = {1, 4, 8, 13};
        int k2 = 5;
        int expected2 = 2;
        int result2 = solution.maxFrequency(nums2, k2);
        Assert.assertEquals(expected2, result2);

        // Test case 3
        int[] nums3 = {3, 9, 10, 20};
        int k3 = 3;
        int expected3 = 1;
        int result3 = solution.maxFrequency(nums3, k3);
        Assert.assertEquals(expected3, result3);

        // Test case 4
        int[] nums4 = {1};
        int k4 = 10;
        int expected4 = 1;
        int result4 = solution.maxFrequency(nums4, k4);
        Assert.assertEquals(expected4, result4);
    }
}
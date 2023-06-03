package org.LeetCodeExercise.SlidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximum239Test {

    @Test
    void maxSlidingWIndow() {
            SlidingWindowMaximum239 swm = new SlidingWindowMaximum239();

            // Test case 1: Normal input
            int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
            int k1 = 3;
            int[] expected1 = {3, 3, 5, 5, 6, 7};
            int[] result1 = swm.maxSlidingWindow(nums1, k1);
            Assertions.assertArrayEquals(expected1, result1);

            // Test case 2: Smaller input array
            int[] nums2 = {9, 8, 7, 6, 5};
            int k2 = 3;
            int[] expected2 = {9, 8, 7};
            int[] result2 = swm.maxSlidingWindow(nums2, k2);
            Assertions.assertArrayEquals(expected2, result2);

            // Test case 3: Larger input array
            int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int k3 = 4;
            int[] expected3 = {4, 5, 6, 7, 8, 9};
            int[] result3 = swm.maxSlidingWindow(nums3, k3);
            Assertions.assertArrayEquals(expected3, result3);
        }

}
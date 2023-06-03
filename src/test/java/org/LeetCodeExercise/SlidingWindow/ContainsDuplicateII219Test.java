package org.LeetCodeExercise.SlidingWindow;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateII219Test {

    @Test
    public void testContainsNearbyDuplicate() {
        ContainsDuplicateII219 solution = new ContainsDuplicateII219();

        // Test case 1: Duplicate exists within the given range (k = 3)
        int[] nums1 = {1, 2, 3, 5, 4, 9,6,7, 1};
        int k1 = 3;
        boolean result1 = solution.containsNearbyDuplicate(nums1, k1);
        assertTrue(result1);


    }

    @Test
    public void testContainsNearbyDuplicate2() {
        ContainsDuplicateII219 solution = new ContainsDuplicateII219();

        // Test case 2: No duplicate exists within the given range (k = 2)
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        boolean result2 = solution.containsNearbyDuplicate(nums2, k2);
        Assert.assertFalse(result2);


        // Test case 4: Empty array
        int[] nums4 = {};
        int k4 = 2;
        boolean result4 = solution.containsNearbyDuplicate(nums4, k4);
        Assert.assertFalse(result4);

        // Test case 5: Duplicate exists with a large range (k = 100)
        int[] nums5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        int k5 = 100;
        boolean result5 = solution.containsNearbyDuplicate(nums5, k5);
        Assert.assertTrue(result5);
    }
}
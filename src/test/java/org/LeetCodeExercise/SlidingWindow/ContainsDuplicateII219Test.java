package org.LeetCodeExercise.SlidingWindow;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateII219Test {

    @Test
    public void testContainsNearbyDuplicate() {
        ContainsDuplicateII219 solution = new ContainsDuplicateII219();

        // Test case 1: Duplicate exists within the given range (k = 3)
        int[] nums1 = {1, 2, 3 ,7, 1};
        int k1 = 3;
        boolean result1 = solution.containsNearbyDuplicate(nums1, k1);
        assertTrue(result1);


    }
}
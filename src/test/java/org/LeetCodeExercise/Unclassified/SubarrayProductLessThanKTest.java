package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.SubarrayProductLessThanK713;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayProductLessThanKTest {

    @Test
    void numSubarrayProductLessThanK() {
        SubarrayProductLessThanK713 prodsum = new SubarrayProductLessThanK713();
        int[] nums = {10,5,2,6,7,8,9,12,4};
        int k = 100;
        int result = prodsum.numSubarrayProductLessThanK(nums, k);
        assertEquals(18, result);
    }
}
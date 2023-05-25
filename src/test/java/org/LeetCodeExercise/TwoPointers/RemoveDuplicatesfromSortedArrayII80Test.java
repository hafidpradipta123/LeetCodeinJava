package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesfromSortedArrayII80Test {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedArray26 formula = new RemoveDuplicatesFromSortedArray26();
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int output = 5;
        int result = formula.removeDuplicates(nums);
        assertEquals(5, result);
    }
}
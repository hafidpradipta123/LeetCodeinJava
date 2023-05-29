package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesfromSortedArrayII80Test {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesfromSortedArrayII80 formula = new RemoveDuplicatesfromSortedArrayII80();
        int [] nums = {1,1,1,3,3,4,6,2,2,7,8,0,0,5};
        int output = 5;
        int result = formula.removeDuplicates(nums);
        assertEquals(5, result);
    }
}
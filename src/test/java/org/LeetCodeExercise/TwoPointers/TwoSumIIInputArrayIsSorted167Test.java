package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIIInputArrayIsSorted167Test {

    @Test
    void twoSum() {
        TwoSumIIInputArrayIsSorted167 formula = new TwoSumIIInputArrayIsSorted167();
        int [] input = {2,7,11,15};
        int target = 9;
        int [] output = {1,2};
        int [] result = formula.twoSum(input, target);
        assertArrayEquals(output, result);
    }
}
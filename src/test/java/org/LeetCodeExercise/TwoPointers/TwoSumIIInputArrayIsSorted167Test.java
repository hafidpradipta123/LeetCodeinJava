package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIIInputArrayIsSorted167Test {

    @Test
    void twoSum() {
        TwoSumIIInputArrayIsSorted167 formula = new TwoSumIIInputArrayIsSorted167();
        int [] input = {10,12,15,30,45,60,70,80,90};
        int target = 40;
        int [] output = {2,4};
        int [] result = formula.twoSum(input, target);
        assertArrayEquals(output, result);
    }
}
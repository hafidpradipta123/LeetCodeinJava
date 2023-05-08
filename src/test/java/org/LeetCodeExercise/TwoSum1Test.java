package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum1Test {

    @Test
    void twoSum() {
        TwoSum1 formula = new TwoSum1();
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] result = formula.twoSum(nums, target);
        int [] expected = {0,1};
        assertArrayEquals(expected,result);
    }
}
package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElement27Test {

    @Test
    void removeElement() {

        RemoveElement27 formula = new RemoveElement27();

        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int expectedSize = 8;
        int result = formula.removeElement(nums, val);
        assertEquals(expectedSize, result);
        int[] expectedNums = {0,1,3,0,4,0,4,2};
        assertArrayEquals(expectedNums, nums);

    }
}
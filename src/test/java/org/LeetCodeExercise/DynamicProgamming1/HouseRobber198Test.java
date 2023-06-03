package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber198Test {
    @Test
    void rob2() {
        HouseRobber198 formula = new HouseRobber198();
        int [] nums = {2,7,9,3,1};
        int expected = 12;
        int actual = formula.rob(nums);
        assertEquals(expected, actual);
    }

}
package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSum() {
       int [] nums = {2,7,11,15};
       int target = 9;

       TwoSum ts= new TwoSum();
       int [] result = ts.twoSum(nums, target);

    }
}
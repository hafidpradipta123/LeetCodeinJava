package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.TwoSum1;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSum() {
       int [] nums = {2,7,11,15};
       int target = 9;

       TwoSum1 ts= new TwoSum1();
       int [] result = ts.twoSum(nums, target);

    }
}
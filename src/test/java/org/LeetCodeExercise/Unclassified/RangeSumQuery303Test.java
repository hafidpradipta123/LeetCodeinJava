package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.RangeSumQuery303;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQuery303Test {

    @Test
    void sumRange() {
        int [] nums = {-2,0,3,-5,2,-1};
        RangeSumQuery303 formula = new RangeSumQuery303(nums);
        assertEquals(1, formula.sumRange(0,2));
        assertEquals(-1, formula.sumRange(2,5));
        assertEquals(-3, formula.sumRange(0,5));
    }
}
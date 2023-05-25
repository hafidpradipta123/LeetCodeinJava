package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.PivotIndex724;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIndex724Test {

    @Test
    void pivotIndex() {
        PivotIndex724 formula = new PivotIndex724();
        int [] nums = {1,7,3,6,5,6};
        int expected = 3;
        int result = formula.pivotIndex(nums);
        assertEquals(expected,result);

    }
}
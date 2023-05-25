package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDifferenceBetweenHighestandLowestKScores1984Test {

    @Test
    void minimumDifference() {
        MinimumDifferenceBetweenHighestandLowestKScores1984 formula = new MinimumDifferenceBetweenHighestandLowestKScores1984();
        int[] nums = {9,4,1,7};
        int k = 1;
        int expected = 2;
        int result = formula.minimumDifference(nums,k);
        assertEquals(expected,result );
    }
}
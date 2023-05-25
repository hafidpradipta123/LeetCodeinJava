package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberofSubsequencesThatSatisfytheGienSumCOndition1498Test {

    @Test
    void numSubseq() {
        NumberofSubsequencesThatSatisfytheGienSumCOndition1498 formula = new NumberofSubsequencesThatSatisfytheGienSumCOndition1498();
        int [] input = {3,5,6,7};
        int target = 9;
        int expected = 4;
        int result = formula.numSubseq(input, target);
        assertEquals(expected, result);
    }
}
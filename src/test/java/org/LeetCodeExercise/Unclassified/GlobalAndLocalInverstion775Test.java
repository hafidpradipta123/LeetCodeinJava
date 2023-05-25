package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.GlobalAndLocalInverstion775;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GlobalAndLocalInverstion775Test {

    @Test
    void isIdealPermutation() {
        GlobalAndLocalInverstion775 formula = new GlobalAndLocalInverstion775();
        int [] input = {1,0,2};
        boolean result = formula.isIdealPermutation(input);
        assertTrue(result);
    }
    @Test
    void isIdealPermutationFalse() {
        GlobalAndLocalInverstion775 formula = new GlobalAndLocalInverstion775();
        int [] input = {1,2,0};
        boolean result = formula.isIdealPermutation(input);
        assertFalse(result);
    }
}
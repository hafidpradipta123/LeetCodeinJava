package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductLength2002Test {

    @Test
    void countPalindromicSubsequence() {
        MaxProductLength2002 formula = new MaxProductLength2002();
        String input = "leetcodecom";
        int result = formula.countPalindromicSubsequence(input);
        assertEquals(9,result);
    }
}
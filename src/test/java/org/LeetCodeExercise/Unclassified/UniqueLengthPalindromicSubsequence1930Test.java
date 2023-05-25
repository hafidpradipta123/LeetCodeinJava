package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.UniqueLengthPalindromicSubsequence1930;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueLengthPalindromicSubsequence1930Test {

    @Test
    void countPalindromicSubsequence() {
        UniqueLengthPalindromicSubsequence1930 formula = new UniqueLengthPalindromicSubsequence1930();
        String input = "aabca";
        int expected = 3;
        int result = formula.countPalindromicSubsequence(input);
        assertEquals(expected, result);
    }
}
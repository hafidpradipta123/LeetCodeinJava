package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstring459Test {

    @Test
    void repeatedSubstringPattern() {
        RepeatedSubstring459 formula = new RepeatedSubstring459();
        String input = "abab";
        boolean result = formula.repeatedSubstringPattern(input);
        assertTrue(result);
    }

    @Test
    void repeatedSubstringPattern2() {
        RepeatedSubstring459 formula = new RepeatedSubstring459();
        String input = "abcabcabcabcabcabcabcabcabcabc";
        boolean result = formula.repeatedSubstringPattern(input);
        assertTrue(result);
    }


    @Test
    void repeatedSubstringPatternFalse() {
        RepeatedSubstring459 formula = new RepeatedSubstring459();
        String input = "abcabcabcabcabcabcabcabcabcabcdef";
        boolean result = formula.repeatedSubstringPattern(input);
        assertFalse(result);
    }
}
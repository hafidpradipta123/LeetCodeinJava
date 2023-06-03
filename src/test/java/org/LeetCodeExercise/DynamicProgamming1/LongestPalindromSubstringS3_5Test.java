package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromSubstringS3_5Test {
    @Test
    void longestPalindrome() {
        LongestPalindromSubstringS3_5 formula = new LongestPalindromSubstringS3_5();
        String input = "racecar";
        String result = formula.longestPalindrome(input);
        assertEquals("racecar", result);
    }

    @Test
    void longestPalindrome2() {
        LongestPalindromSubstringS3_5 formula = new LongestPalindromSubstringS3_5();
        String input = "babad";
        String result = formula.longestPalindrome(input);
        assertEquals("aba", result);
    }

    @Test
    void longestPalindrome3() {
        LongestPalindromSubstringS3_5 formula = new LongestPalindromSubstringS3_5();
        String input = "cbbd";
        String result = formula.longestPalindrome(input);
        assertEquals("bb", result);
    }

    @Test
    void longestPalindrome4() {
        LongestPalindromSubstringS3_5 formula = new LongestPalindromSubstringS3_5();
        String input = "bekacbbdntanpulauumangcbbd";
        String result = formula.longestPalindrome(input);
        assertEquals("bb", result);
    }

}
package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstring5Test {

    @Test
    void longestPalindrome() {
        LongestPalindromicSubstring5 formula = new LongestPalindromicSubstring5();
        String input = "racecar";
        String result = formula.longestPalindrome(input);
        assertEquals("racecar", result);
    }

    @Test
    void longestPalindrome2() {
        LongestPalindromicSubstring5 formula = new LongestPalindromicSubstring5();
        String input = "babad";
        String result = formula.longestPalindrome(input);
        assertEquals("aba", result);
    }

    @Test
    void longestPalindrome3() {
        LongestPalindromicSubstring5 formula = new LongestPalindromicSubstring5();
        String input = "cbbd";
        String result = formula.longestPalindrome(input);
        assertEquals("bb", result);
    }

    @Test
    void longestPalindrome4() {
        LongestPalindromicSubstring5 formula = new LongestPalindromicSubstring5();
        String input = "bekacbbdntanpulauumangcbbd";
        String result = formula.longestPalindrome(input);
        assertEquals("bb", result);
    }

    @Test
    void expandFromMiddle() {
    }
}
package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindrome680Test {

    @Test
    void validPalindrome() {
        ValidPalindrome680 validPalindrome = new ValidPalindrome680();

        // Test case 1: Valid palindrome
        String s1 = "level";
        boolean expected1 = true;
        boolean result1 = validPalindrome.validPalindrome(s1);
        assertEquals(expected1, result1);

        // Test case 2: Invalid palindrome
        String s2 = "algorithm";
        boolean expected2 = false;
        boolean result2 = validPalindrome.validPalindrome(s2);
        assertEquals(expected2, result2);
    }

    @Test
    void validPalindromeUtil() {
    }
}
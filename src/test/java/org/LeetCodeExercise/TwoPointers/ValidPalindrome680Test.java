package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindrome680Test {

    @Test
    void validPalindrome() {
        ValidPalindrome680 validPalindrome = new ValidPalindrome680();

        // Test case 1: Valid palindrome
        String s1 = "levelc";
        boolean expected1 = true;
        boolean result1 = validPalindrome.validPalindrome(s1);
        assertEquals(expected1, result1);

    }

    @Test
    void validPalindromeUtil() {
    }
}
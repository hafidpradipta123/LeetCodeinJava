package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindrome125Test {

    @Test
    void isPalindrome() {
        ValidPalindrome125 pl = new ValidPalindrome125();
        String input = "A man, a plan, a canal: Panama";
        assertTrue(pl.isPalindrome(input));
    }



}
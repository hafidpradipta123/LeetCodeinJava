package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagram242Test {

    @Test
    void isAnagram() {
        ValidAnagram242 formula = new ValidAnagram242();
        String s = "anagram";
        String t = "nagaram";
        boolean result = formula.isAnagram(s,t);
        assertTrue(result);
    }
}
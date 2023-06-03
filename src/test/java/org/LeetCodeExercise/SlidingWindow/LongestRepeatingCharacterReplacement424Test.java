package org.LeetCodeExercise.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacement424Test {

    @Test
    void characterReplacement() {
        LongestRepeatingCharacterReplacement424 solution = new LongestRepeatingCharacterReplacement424();

        // Test case 1: Example from the problem description
        String s1 = "AABABBA";
        int k1 = 1;
        int expected1 = 4;
        int result1 = solution.characterReplacement(s1, k1);
        assertEquals(expected1, result1);

        // Test case 2: All characters are the same
        String s2 = "AAAA";
        int k2 = 2;
        int expected2 = 4;
        int result2 = solution.characterReplacement(s2, k2);
        assertEquals(expected2, result2);

        // Test case 3: No need to replace any characters
        String s3 = "ABCD";
        int k3 = 0;
        int expected3 = 1;
        int result3 = solution.characterReplacement(s3, k3);
        assertEquals(expected3, result3);

        // Test case 4: Empty string
        String s4 = "";
        int k4 = 3;
        int expected4 = 0;
        int result4 = solution.characterReplacement(s4, k4);
        assertEquals(expected4, result4);

        // Test case 5: Larger string with multiple replacements
        String s5 = "ABABCDABC";
        int k5 = 2;
        int expected5 = 6;
        int result5 = solution.characterReplacement(s5, k5);
        assertEquals(expected5, result5);
    }
}
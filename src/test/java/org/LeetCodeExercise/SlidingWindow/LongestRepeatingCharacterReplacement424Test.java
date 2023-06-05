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
    }
}
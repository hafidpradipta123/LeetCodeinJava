package org.LeetCodeExercise.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationinString567Test {

    @Test
    public void testCheckInclusion() {
        PermutationinString567 permutation = new PermutationinString567();

        // Test case 1: s1 is a permutation of s2, should return true
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(permutation.checkInclusion(s1, s2));

        // Test case 2: s1 is not a permutation of s2, should return false
        s1 = "ab";
        s2 = "eidboaoo";
        assertFalse(permutation.checkInclusion(s1, s2));

        // Test case 3: s1 is longer than s2, should return false
        s1 = "abcde";
        s2 = "abc";
        assertFalse(permutation.checkInclusion(s1, s2));

        // Test case 4: s1 and s2 are empty strings, should return true
        s1 = "";
        s2 = "";
        assertTrue(permutation.checkInclusion(s1, s2));

        // Test case 5: s1 and s2 have the same characters but different counts, should return false
        s1 = "aab";
        s2 = "abb";
        assertFalse(permutation.checkInclusion(s1, s2));
    }

}
package org.LeetCodeExercise.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationinString567Test {

    @Test
    public void testCheckInclusion() {
        PermutationinString567 permutation = new PermutationinString567();

        // Test case 1: s1 is a permutation of s2, should return true
        String s1 = "ab";
        String s2 = "eideefhchbacci";
        assertTrue(permutation.checkInclusion(s1, s2));
    }

}
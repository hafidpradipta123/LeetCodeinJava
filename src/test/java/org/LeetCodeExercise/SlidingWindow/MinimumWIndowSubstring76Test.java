package org.LeetCodeExercise.SlidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWIndowSubstring76Test {

    @Test
    void minWindow() {
        MinimumWIndowSubstring76 solution = new MinimumWIndowSubstring76();

        // Test case 1: Basic example
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";
        String expected1 = "BANC";
        Assertions.assertEquals(expected1, solution.minWindow(s1, t1));

        // Test case 2: Empty string
        String s2 = "";
        String t2 = "ABC";
        String expected2 = "";
        Assertions.assertEquals(expected2, solution.minWindow(s2, t2));

        // Test case 3: Missing characters
        String s3 = "ADOBECODEBANC";
        String t3 = "XYZ";
        String expected3 = "";
        Assertions.assertEquals(expected3, solution.minWindow(s3, t3));

        // Test case 4: Multiple valid windows
        String s4 = "AABBCC";
        String t4 = "ABC";
        String expected4 = "ABBC";
        Assertions.assertEquals(expected4, solution.minWindow(s4, t4));

        // Test case 5: T is longer than S
        String s5 = "ABC";
        String t5 = "ABCD";
        String expected5 = "";
        Assertions.assertEquals(expected5, solution.minWindow(s5, t5));
    }
}
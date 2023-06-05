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
    }
}
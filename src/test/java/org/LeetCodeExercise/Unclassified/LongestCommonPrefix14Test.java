package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.LongestCommonPrefix14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefix14Test {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix14 formula = new LongestCommonPrefix14();
        String[] strs = {"flower","flow","flight"};
        String result = formula.longestCommonPrefix(strs);
        String expected = "fl";
        assertEquals(expected, result);

    }
}
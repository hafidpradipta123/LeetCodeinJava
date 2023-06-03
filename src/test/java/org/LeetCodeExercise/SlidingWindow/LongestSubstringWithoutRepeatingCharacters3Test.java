package org.LeetCodeExercise.SlidingWindow;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharacters3Test {

    @Test
    void lengthOfLongestSubString() {
        LongestSubstringWithoutRepeatingCharacters3 solution = new LongestSubstringWithoutRepeatingCharacters3();


        // Test case 2: Input with repeating characters
        String s2 = "abcabcbb";
        int expected2 = 3;
        int result2 = solution.lengthOfLongestSubString(s2);
        Assert.assertEquals(expected2, result2);

    }
}
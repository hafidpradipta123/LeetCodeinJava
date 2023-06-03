package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstring647Test {
    @Test
    public void testCountSubstring() {
    PalindromicSubstring647 palindromicSubstring = new PalindromicSubstring647();

    // Test case 1: Single character input
    String input1 = "a";
    int expected1 = 1;
    int result1 = palindromicSubstring.countSubstring(input1);
        Assert.assertEquals(expected1, result1);

    // Test case 2: Palindromic substring in the middle
    String input2 = "abcba";
    int expected2 = 7;
    int result2 = palindromicSubstring.countSubstring(input2);
        Assert.assertEquals(expected2, result2);

    // Test case 3: No palindromic substring
    String input3 = "xyz";
    int expected3 = 3;
    int result3 = palindromicSubstring.countSubstring(input3);
        Assert.assertEquals(expected3, result3);

    // Test case 4: Empty string
    String input4 = "";
    int expected4 = 0;
    int result4 = palindromicSubstring.countSubstring(input4);
        Assert.assertEquals(expected4, result4);

    // Test case 5: Long palindrome
    String input5 = "abcdeedcbaf";
    int expected5 = 11;
    int result5 = palindromicSubstring.countSubstring(input5);
        Assert.assertEquals(expected5, result5);
}

}
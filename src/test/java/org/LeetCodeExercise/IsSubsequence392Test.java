package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequence392Test {

    @Test
    void isSubsequence() {
        IsSubsequence392 formula = new IsSubsequence392();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = formula.isSubsequence(s,t);
        assertTrue(result);
    }
}
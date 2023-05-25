package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.MinimumRemoveToMakeValidParentheses1249;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumRemoveToMakeValidParentheses1249Test {

    @Test
    void minRemoveToMakeValid() {

        MinimumRemoveToMakeValidParentheses1249 formula = new MinimumRemoveToMakeValidParentheses1249();
        String input = "))((";
        String result = formula.minRemoveToMakeValid(input);
        assertEquals("", result);
    }
    @Test
    void minRemoveToMakeValid2() {

        MinimumRemoveToMakeValidParentheses1249 formula = new MinimumRemoveToMakeValidParentheses1249();
        String input = "lee(t(c)o)de)";
        String result = formula.minRemoveToMakeValid(input);
        assertEquals("lee(t(c)o)de", result);
    }
    @Test
    void minRemoveToMakeValid3() {

        MinimumRemoveToMakeValidParentheses1249 formula = new MinimumRemoveToMakeValidParentheses1249();
        String input = "a)b(c)d";
        String result = formula.minRemoveToMakeValid(input);
        assertEquals("ab(c)d", result);
    }


}
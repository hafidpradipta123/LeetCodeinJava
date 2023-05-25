package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ScoreofParentheses856;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreofParentheses856Test {

    @Test
    void scoreOfParentheses() {
        ScoreofParentheses856 formula = new ScoreofParentheses856();
        String input = "((()()))";
        int output = formula.scoreOfParentheses(input);
        assertEquals(8, output);
    }
}
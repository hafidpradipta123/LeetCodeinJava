package org.LeetCodeExercise.Stack;

import org.LeetCodeExercise.Unclassified.GenerateParentheses22;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesStack22Test {

    @Test
    void main() {
        GenerateParentheses22 formula = new GenerateParentheses22();
        int input = 3;
        List<String> expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");
        List<String> actual = formula.generateParentheses(3);
        assertEquals(expected, actual);
    }

    @Test
    void generateParenthesis() {
    }
}
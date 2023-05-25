package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.GenerateParentheses22;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParentheses22Test {

    @Test
    void generateParentheses() {
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
    void backtrack() {
        GenerateParentheses22 gp = new GenerateParentheses22();
        List<String> expected = new ArrayList<>();
        expected.add("(())");
        expected.add("()()");
        List<String> actual = new ArrayList<>();
        gp.backtrack(actual, "", 0, 0, 2);
        Collections.sort(expected);
        Collections.sort(actual);
        assertEquals(expected, actual);
    }
}
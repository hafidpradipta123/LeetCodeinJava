package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.WordPattern290;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPattern290Test {

    @Test
    void wordPattern() {
        WordPattern290 formula = new WordPattern290();
        String pattern = "abba";
        String s = "dog cat cat dog";

        assertTrue(formula.wordPattern(pattern, s));
    }

    @Test
    void wordPatternFalse() {
        WordPattern290 formula = new WordPattern290();
        String pattern = "abba";
        String s = "dog cat cat bekantan";

        assertTrue(formula.wordPattern(pattern, s));
    }
}
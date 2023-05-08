package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthofLastWord58Test {

    @Test
    void lengthOfLastWord() {
        LengthofLastWord58 formula = new LengthofLastWord58();
        String input = "   fly me   to   the moon ";
        int result = formula.lengthOfLastWord(input);
        assertEquals(4,result);
    }
}
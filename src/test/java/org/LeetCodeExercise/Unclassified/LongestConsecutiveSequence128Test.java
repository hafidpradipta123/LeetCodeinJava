package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.LongestConsecutiveSequence128;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequence128Test {

    @Test
    void longestConsecutive() {
        LongestConsecutiveSequence128 formula = new LongestConsecutiveSequence128();
        int[] input = {0,3,7,2,5,8,4,6,0,1,13,212,900,4334, 11, 12, 13,14};
        int result = formula.longestConsecutive(input);
        int expected = 9;
        assertEquals(expected,result);

    }
}
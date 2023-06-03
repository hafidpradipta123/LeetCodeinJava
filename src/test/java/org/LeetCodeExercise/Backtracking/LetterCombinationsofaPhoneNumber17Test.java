package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsofaPhoneNumber17Test {
    @Test
    public void testLetterCombinations() {
        LetterCombinationsofaPhoneNumber17 solution = new LetterCombinationsofaPhoneNumber17();

        // Test case 1
        String digits1 = "23";
        List<String> expected1 = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> result1 = solution.letterCombinations(digits1);
        Assertions.assertEquals(expected1, result1);

        // Test case 2
        String digits2 = "79";
        List<String> expected2 = Arrays.asList("pw", "px", "py", "pz", "qw", "qx", "qy", "qz", "rw", "rx", "ry", "rz", "sw", "sx", "sy", "sz");
        List<String> result2 = solution.letterCombinations(digits2);
        Assertions.assertEquals(expected2, result2);

        // Test case 3
        String digits3 = "";
        List<String> expected3 = Arrays.asList();
        List<String> result3 = solution.letterCombinations(digits3);
        Assertions.assertEquals(expected3, result3);
    }
}
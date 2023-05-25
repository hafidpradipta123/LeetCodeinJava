package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.CheckifAStringContainsAllBinary1461;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckifAStringContainsAllBinary1461Test {

    @Test
    void hasAllCodes() {
        CheckifAStringContainsAllBinary1461 formula = new CheckifAStringContainsAllBinary1461();
        String input = "00110110";
        int k = 2;
        boolean result = formula.hasAllCodes(input, k);
        assertTrue(result);
    }
}
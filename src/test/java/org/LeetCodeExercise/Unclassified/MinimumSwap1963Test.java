package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.MinimumSwap1963;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwap1963Test {

    @Test
    void minSwaps() {
        MinimumSwap1963 formula = new MinimumSwap1963();
        String input =   "]]][[[";
        int expected = 2;
        int result = formula.minSwaps(input);
        assertEquals(expected, result);
    }
}
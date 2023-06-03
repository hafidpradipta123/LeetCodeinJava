package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Combinations77Test {

    @Test
    public void testCombine() {
        // Test case inputs
        int n = 4;
        int k = 2;

        // Expected output
        List<List<Integer>> expected = List.of(
                List.of(1, 2),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 3),
                List.of(2, 4),
                List.of(3, 4)
        );

        // Actual output
        List<List<Integer>> actual = Combinations77.combine(n, k);

        // Assert
        assertEquals(expected, actual);
    }

}
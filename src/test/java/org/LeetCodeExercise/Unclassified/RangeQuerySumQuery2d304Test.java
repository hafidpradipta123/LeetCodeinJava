package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.RangeQuerySumQuery2d304;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeQuerySumQuery2d304Test {

    @Test
    void sumRegion() {

        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        RangeQuerySumQuery2d304 numMatrix = new RangeQuerySumQuery2d304(matrix);
        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
        assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
        assertEquals(12, numMatrix.sumRegion(1, 2, 2, 4));
    }

}
package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayS2189Test {

    @Test
    void rotate() {
        RotateArrayS2189 formula = new RotateArrayS2189();
        int [] input = {1,2,3,4,5,6,7};
        int k = 3;
        int [] expected = {5,6,7,1,2,3,4};
        formula.rotate(input,k);
        assertArrayEquals( expected, input);

    }
}
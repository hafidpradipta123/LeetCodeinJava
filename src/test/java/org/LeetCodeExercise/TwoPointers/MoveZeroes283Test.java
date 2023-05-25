package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroes283Test {

    @Test
    void moveZeroes() {
        MoveZeroes283 formula = new MoveZeroes283();
        int [] input = {0, 1, 0, 3, 12};
        int [] expected = {1,3,12,0,0};
        formula.moveZeroes(input);
        assertArrayEquals(new int [] {1,3,12,0,0}, input);
    }
}
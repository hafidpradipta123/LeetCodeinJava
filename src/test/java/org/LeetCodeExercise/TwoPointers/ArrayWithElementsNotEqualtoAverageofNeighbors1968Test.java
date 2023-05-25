package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithElementsNotEqualtoAverageofNeighbors1968Test {

    @Test
    void rearrangeArray() {
        ArrayWithElementsNotEqualtoAverageofNeighbors1968 formula = new ArrayWithElementsNotEqualtoAverageofNeighbors1968();
        int [] input = {1,2,3,4,5};
        int [] expected = {1,2,4,5,3};
        int [] result = formula.rearrangeArray(input);
    }
}
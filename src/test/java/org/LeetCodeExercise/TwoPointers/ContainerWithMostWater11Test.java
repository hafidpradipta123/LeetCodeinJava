package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWater11Test {

    @Test
    void maxArea() {
        ContainerWithMostWater11 formula = new ContainerWithMostWater11();
        int [] height = {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        int result = formula.maxArea(height);
        assertEquals(49, result);
    }
}
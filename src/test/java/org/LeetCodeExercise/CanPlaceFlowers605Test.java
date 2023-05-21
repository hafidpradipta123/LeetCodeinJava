package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowers605Test {

    @Test
    void canPlaceFlowers() {
        CanPlaceFlowers605 formula = new CanPlaceFlowers605();
        int [] flowerbed = {1,0,0,0,1};
        int n = 1;
        boolean result = formula.canPlaceFlowers(flowerbed,n);
        assertTrue(result);
    }
}
package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.HandofStraights846;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandofStraights846Test {

    @Test
    void isNStraightHand() {
        HandofStraights846 formula = new HandofStraights846();
        int [] input = {1,2,3,6,2,3,4,7,8};
        int W = 3;
        boolean result = formula.isNStraightHand(input, W);
        assertTrue(result);
    }
}
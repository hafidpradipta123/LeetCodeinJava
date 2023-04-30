package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestUnsortedContinuousSubarray581Test {

    @Test
    void findUnsortedSubarray() {

        ShortestUnsortedContinuousSubarray581 formula = new ShortestUnsortedContinuousSubarray581();
        int [] input = {1,2,5,8,9,12,4,10,11,17,18,21};
        int  result = formula.findUnsortedSubarray(input);
        assertEquals(7, result);

    }
    @Test
    void findUnsortedSubarray2() {

        ShortestUnsortedContinuousSubarray581 formula = new ShortestUnsortedContinuousSubarray581();
        int [] input = {1,2,3,4};
        int  result = formula.findUnsortedSubarray(input);
        assertEquals(0, result);

    }
}
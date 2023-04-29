package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreesumClosest16Test {

    @Test
    void threeSumClosest() {

        ThreesumClosest16 tsc = new ThreesumClosest16();
        int[] input  = {-1,2,1,-4};
        int target = 1;
        int output = tsc.threeSumClosest(input, target);
        int expected = 2;
        assertEquals(expected, output);
    }
}
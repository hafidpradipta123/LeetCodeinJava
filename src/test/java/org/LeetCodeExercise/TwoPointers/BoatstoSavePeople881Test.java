package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatstoSavePeople881Test {

    @Test
    void numRescueBoats() {
        BoatstoSavePeople881 formula = new BoatstoSavePeople881();
        int [] people = {3,2,2,1};
        int limit = 3;
        int result = formula.numRescueBoats(people, limit);

        assertEquals(3, result);
    }
}
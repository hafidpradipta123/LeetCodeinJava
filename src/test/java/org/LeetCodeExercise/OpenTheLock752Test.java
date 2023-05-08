package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenTheLock752Test {

    @Test
    void openLock() {
        OpenTheLock752 formula = new OpenTheLock752();
        String[] deadends  = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        int expected = 6;
        int actual = formula.openLock(deadends, target);
        assertEquals(expected, actual);

    }
}
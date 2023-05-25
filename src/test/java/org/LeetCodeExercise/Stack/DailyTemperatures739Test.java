package org.LeetCodeExercise.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperatures739Test {

    @Test
    void dailyTemperatures() {
        DailyTemperatures739 formula = new DailyTemperatures739();
        int [] input = {73,74,75,71,69,72,76,73};
        int [] expected = {1,1,4,2,1,1,0,0};
        int[] result = formula.dailyTemperatures(input);
        assertArrayEquals(expected, result);
    }
}
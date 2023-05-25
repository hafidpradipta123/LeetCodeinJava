package org.LeetCodeExercise.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGame682Test {

    @Test
    void calPoints() {

        BaseballGame682 game = new BaseballGame682();

        // Test case 1: ["5", "2", "C", "D", "+"]
        String[] operations1 = {"5", "2", "C", "D", "+"};
        int expected1 = 30;
        int result1 = game.calPoints(operations1);
        assertEquals(expected1, result1);

        // Test case 2: ["5", "-2", "4", "C", "D", "9", "+", "+"]
        String[] operations2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        int expected2 = 27;
        int result2 = game.calPoints(operations2);
        assertEquals(expected2, result2);

        // Test case 3: ["1"]
        String[] operations3 = {"1"};
        int expected3 = 1;
        int result3 = game.calPoints(operations3);
        assertEquals(expected3, result3);

        // Test case 4: []
        String[] operations4 = {};
        int expected4 = 0;
        int result4 = game.calPoints(operations4);
        assertEquals(expected4, result4);
    }
}
package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.BestTimetoBuyAndSellStock121;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimetoBuyAndSellStock121Test {

    @Test
    void maxProfit() {
        BestTimetoBuyAndSellStock121 formula = new BestTimetoBuyAndSellStock121();
        int [] input = {7,1,5,3,6,4};
        int result = formula.maxProfit(input);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void maxProfit2() {
        BestTimetoBuyAndSellStock121 formula = new BestTimetoBuyAndSellStock121();
        int [] input = {7,6,4,3,1};
        int result = formula.maxProfit(input);
        int expected = 0;
        assertEquals(expected, result);
    }
}
package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.BestTimetoBuyAndSellStock121;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimetoBuyAndSellStockTest {

    @Test
    void maxProfit() {
        BestTimetoBuyAndSellStock121 buy = new BestTimetoBuyAndSellStock121();
        int [] prices = {7,1,5,3,6,4};
        int expected = 5;
        int result= buy.maxProfit(prices);
        assertEquals(expected, result   );
    }
}
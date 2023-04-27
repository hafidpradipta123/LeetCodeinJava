package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimetoBuyAndSellStockTest {

    @Test
    void maxProfit() {
        BestTimetoBuyAndSellStock buy = new BestTimetoBuyAndSellStock();
        int [] prices = {7,1,5,3,6,4};
        int expected = 5;
        int result= buy.maxProfit(prices);
        assertEquals(expected, result   );
    }
}
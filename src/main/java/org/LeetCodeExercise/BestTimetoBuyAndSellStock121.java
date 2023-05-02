package org.LeetCodeExercise;

public class BestTimetoBuyAndSellStock121 {
    public int maxProfit(int[] prices){
        int min_val = Integer.MAX_VALUE; // because 32 bit signed integer. 2^31-1
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++){
            if(prices[i] < min_val){
                min_val = prices[i];
            } else if (prices[i] - min_val > max_profit ){
                max_profit = prices[i] - min_val;
            }
        }
        return max_profit;
    }
}

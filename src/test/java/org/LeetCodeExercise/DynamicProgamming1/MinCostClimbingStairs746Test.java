package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairs746Test {



        @Test
        public void testMinCostClimbingStairs() {
            MinCostClimbingStairs746 stairs = new MinCostClimbingStairs746();

            // Test case 1
            int[] cost1 = {10, 15, 20};
            int expected1 = 15;
            int result1 = stairs.minCostClimbingStairs(cost1);
            assertEquals(expected1, result1);

            // Test case 2
            int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
            int expected2 = 6;
            int result2 = stairs.minCostClimbingStairs(cost2);
            assertEquals(expected2, result2);

            // Test case 3
            int[] cost3 = {0, 0, 0, 0};
            int expected3 = 0;
            int result3 = stairs.minCostClimbingStairs(cost3);
            assertEquals(expected3, result3);

            // Test case 4
            int[] cost4 = {1, 2, 3, 4};
            int expected4 = 4;
            int result4 = stairs.minCostClimbingStairs(cost4);
            assertEquals(expected4, result4);
        }
}
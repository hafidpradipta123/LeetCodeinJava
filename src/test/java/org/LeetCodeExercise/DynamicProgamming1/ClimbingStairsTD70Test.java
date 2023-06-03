package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTD70Test {
    private ClimbingStairsTD70 climbingStairs70 = new ClimbingStairsTD70();

    @Test
    public void testClimbStairsWithFourSteps() {
        int result = climbingStairs70.climbStairs(5);
        assertEquals(8, result);
    }


}
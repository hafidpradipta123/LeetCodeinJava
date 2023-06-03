package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairs70Test {
    private ClimbingStairs70 climbingStairs70 = new ClimbingStairs70();

    @Test
    public void testClimbStairsWithZeroSteps() {
        int result = climbingStairs70.climbStairs(0);
        assertEquals(1, result);
    }

    @Test
    public void testClimbStairsWithOneStep() {
        int result = climbingStairs70.climbStairs(1);
        assertEquals(1, result);
    }

    @Test
    public void testClimbStairsWithTwoSteps() {
        int result = climbingStairs70.climbStairs(2);
        assertEquals(2, result);
    }

    @Test
    public void testClimbStairsWithThreeSteps() {
        int result = climbingStairs70.climbStairs(3);
        assertEquals(3, result);
    }

    @Test
    public void testClimbStairsWithFourSteps() {
        int result = climbingStairs70.climbStairs(5);
        assertEquals(8, result);
    }

}
package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberII213Test {
    @Test
    public void testRob() {
        HouseRobberII213 robber = new HouseRobberII213();

        // Test case 5: Robbing the first and last house gives the maximum amount
        int[] nums5 = {1, 2, 3, 4, 5};
        int expected5 = 7;
        int result5 = robber.rob(nums5);
        assertEquals(expected5, result5, "Test case 5 failed");
    }

}
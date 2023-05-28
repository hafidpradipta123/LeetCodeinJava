package org.LeetCodeExercise.DynamicProgamming1;

public class HouseRobber198 {
    public int rob(int [] nums){
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int robWithoutIncludingLastHouse = 0, robWithIncludingLastHouse  = 0;

        for (int n : nums){
            int temp = Math.max(
                    robWithoutIncludingLastHouse + n,
                    robWithIncludingLastHouse
            );
            robWithoutIncludingLastHouse = robWithIncludingLastHouse;
            robWithIncludingLastHouse = temp;
        }

        return robWithIncludingLastHouse;
    }

    public int robDP(int [] nums){
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int [] dp = new int [nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}

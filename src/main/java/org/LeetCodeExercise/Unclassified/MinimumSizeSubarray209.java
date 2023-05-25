package org.LeetCodeExercise.Unclassified;

public class MinimumSizeSubarray209 {
    int s = 7;
    int [] input = {2,3,1,2,4,4};
    public int minSubArrayLen(int s, int[] nums){
        int result = Integer.MAX_VALUE;

        int left = 0;
        int val_sum = 0;

        for (int i = 0; i < nums.length; i++){
            val_sum += nums[i];

            while(val_sum >= s){
                result = Math.min(result, i+1 - left);
                val_sum -= nums[left];
                left++;

            }
        }
        return (result != Integer.MAX_VALUE)? result:0;

    }
}

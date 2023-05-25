package org.LeetCodeExercise.TwoPointers;

public class MoveZeroes283 {
    public void moveZeroes(int [] nums){
        int l = 0;
        for(int r = 0; r< nums.length; r++ )
            if(nums[r] != 0){
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
                l += 1;
            }
    }
}

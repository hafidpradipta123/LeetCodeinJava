package org.LeetCodeExercise.TwoPointers;

public class RotateArray189 {
    public void rotate(int [] nums, int k){
        k = k% nums.length;
        int l = 0, r = nums.length-1;

        while(l<r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l += 1;
            r -=1;
        }
        l = 0;
        r = k - 1;
        while(l<r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l += 1;
            r -= 1;
        }
        l = k;
        r = nums.length -1;
        while(l<r){
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l += 1;
            r -= 1;
            l += 1;
            r -=1 ;
        }

    }
}

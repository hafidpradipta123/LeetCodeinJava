package org.LeetCodeExercise.Unclassified;

public class SortColor75 {
    public void sortColors(int[] nums){
        if (nums.length == 0 || nums.length == 1) return;

        int start = 0;
        int end = nums.length - 1;
        int currindex = 0;

        while(currindex <= end && start < end){
            if (nums[currindex] == 0){
                nums[currindex] = nums[start];
                nums[start]  =0;
                start++;
                currindex++;
            }else if (nums[currindex] == 2){
                nums[currindex] = nums[end];
                nums[end] = 2;
                end--;
            } else{
                currindex++;
            }
        }
    }
}

package org.LeetCodeExercise.Unclassified;

import java.util.Arrays;
import java.util.HashSet;

public class containsDuplicate217 {
    public boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums){
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++ ){
            if(nums[i] == nums[i+1]) return true;

        }
        return false;

    }
}

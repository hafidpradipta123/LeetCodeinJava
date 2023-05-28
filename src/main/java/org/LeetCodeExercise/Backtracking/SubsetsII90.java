package org.LeetCodeExercise.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {
    public List<List<Integer>> subsetWithDup(int [] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subSet(nums, 0, ans, list);
        return ans;
    }

    public void subSet(
            int [] nums,
            int idx,
            List<List<Integer>> ans,
            List<Integer> list
    ){
        ans.add(new ArrayList<>(list));

        for (int i = idx; i < nums.length; i++){
            if (i > idx && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            subSet(nums, i + 1, ans, list);
            list.remove(list.size() - 1);


        }
    }
}

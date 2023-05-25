package org.LeetCodeExercise.Unclassified;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInEachTree515 {
    public List<Integer> largestValues(TreeNode root){
        List<Integer> largest_vals = new ArrayList<>();
        helper_DFS(root, largest_vals, 0); // keep track the current level. check in the array if in current
        return largest_vals;
    }
    public void helper_DFS(TreeNode root, List<Integer> largest_vals, int level){
        if (root == null ) return ;
        if(level == largest_vals.size()){
            largest_vals.add(root.val);
        } else{
            largest_vals.set(level,Math.max(largest_vals.get(level), root.val));
        }
        helper_DFS(root.left, largest_vals, level+1);
        helper_DFS(root.right, largest_vals, level+1);

    }
}

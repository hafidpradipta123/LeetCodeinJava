package org.LeetCodeExercise;

import java.util.HashMap;

public class MaximumWidthOfBinaryTree662 {
    int max_width;
    HashMap<Integer, Integer> leftmost_position;
    public int widthOfBinaryTree(TreeNode root){
        max_width = 0;
        leftmost_position = new HashMap();
        get_width(root,0,0);
        return max_width;
    }

    public void get_width(TreeNode root, int depth, int position){
        if (root == null) return;
        leftmost_position.computeIfAbsent(depth, x->position);
        max_width = Math.max(max_width, position - leftmost_position.get(depth) +1);
        get_width(root.left, depth+1, position * 2);
        get_width(root.right, depth+ 1, position * 2+ 1);
    }

}

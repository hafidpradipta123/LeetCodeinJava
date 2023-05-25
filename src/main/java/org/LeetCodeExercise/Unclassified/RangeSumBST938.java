package org.LeetCodeExercise.Unclassified;

import java.util.Stack;

public class RangeSumBST938 {
    public int iterrangeSumBST(TreeNode root, int L, int R) {
        int range_sum = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node != null){
                if(node.val >= L && node.val <= R){
                    range_sum += node.val;
                }
                if(node.val > L){
                    stack.push(node.left);
                }
                if(node.val < R){
                    stack.push(node.right);
                }
            }
        }
        return range_sum;

    }
    int range_sum = 0;
    public int recurrangeSumBST(TreeNode root, int L, int R){
        range_sum = 0;
        get_range_sum (root,L,R);
        return range_sum;
    }

    public void get_range_sum(TreeNode root, int L, int R){
        if(root != null){
            if (root.val >= L && root.val <= R){
                range_sum += root.val;
            }

            if(root.val > L){
                get_range_sum(root.left, L , R);
            }
            if (root.val <R){
                get_range_sum(root.right, L, R);
            }
        }
    }
}

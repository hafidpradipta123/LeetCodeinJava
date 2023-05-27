package org.LeetCodeExercise.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryPostOrder145 {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(0, curr.val);
            if(curr.left != null){
                stack.push(curr.left);
            }
            if (curr.right != null){
                stack.push(curr.right);
            }
        }
        return list;
    }
}

package org.LeetCodeExercise.Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryPreorderTraversalIterative144 {
    public List<Integer> preorderTraversalIterative (TreeNode root){
        List<Integer> pre = new LinkedList<>();
        if(root == null) return pre;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode visiting = stack.pop();
            pre.add(visiting.val);
            if(visiting.right != null) stack.push(visiting.right);
            if(visiting.left != null) stack.push(visiting.left);
        }
        return pre;


    }
}

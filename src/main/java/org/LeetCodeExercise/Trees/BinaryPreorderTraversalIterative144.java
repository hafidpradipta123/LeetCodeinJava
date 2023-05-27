package org.LeetCodeExercise.Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryPreorderTraversalIterative144 {
    public List<Integer> preorderTraversalIterative (TreeNode root){
        List<Integer> pre = new LinkedList<>();
        if(root == null) return pre;
        Stack<TreeNode> tovisit = new Stack<TreeNode>();
        tovisit.push(root);
        while(!tovisit.empty()){
            TreeNode visiting = tovisit.pop();
            pre.add(visiting.val);
            if(visiting.right != null) tovisit.push(visiting.right);
            if(visiting.left != null) tovisit.push(visiting.right);
        }
        return pre;


    }
}

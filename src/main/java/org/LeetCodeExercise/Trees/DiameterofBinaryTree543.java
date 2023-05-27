package org.LeetCodeExercise.Trees;

import com.sun.source.tree.Tree;

public class DiameterofBinaryTree543 {
    int result = -1;
    public int diameterofBinaryTree(TreeNode root){
        dfs(root);
        return result;
    }

    private int dfs(TreeNode current){
        if (current == null){
            return -1;
        }
        int left = 1+ dfs(current.left);
        int right = 1+ dfs(current.right);
        result = Math.max(result, (left + right));
        return Math.max(left, right);

    }
}

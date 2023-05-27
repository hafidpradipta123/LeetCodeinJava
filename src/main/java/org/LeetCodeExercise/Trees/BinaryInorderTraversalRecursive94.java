package org.LeetCodeExercise.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryInorderTraversalRecursive94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res);
        return res;
    }
    public void dfs (TreeNode n, List<Integer> res){
        if (n == null){
            return;
        }
        dfs(n.left, res);
        res.add(n.val);
        dfs(n.right, res);
    }
}

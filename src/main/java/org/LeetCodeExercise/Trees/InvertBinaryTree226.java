package org.LeetCodeExercise.Trees;

import com.sun.source.tree.Tree;

public class InvertBinaryTree226 {
    public TreeNode invertTree (TreeNode root){
        if (root == null) return null;
        TreeNode node = new TreeNode(root.val);
        node.right = invertTree(root.left);
        //node.val = root.val;
        node.left = invertTree(root.right);
        return node;
    }
}

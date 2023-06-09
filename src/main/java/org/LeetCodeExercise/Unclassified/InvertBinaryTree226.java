package org.LeetCodeExercise.Unclassified;

public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root){
        if (root == null){
            return root;

        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //swap
        root.right = left;
        root.left = right;

        return root;

    }
}

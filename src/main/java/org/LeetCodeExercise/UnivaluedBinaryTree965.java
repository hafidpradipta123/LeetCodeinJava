package org.LeetCodeExercise;

public class UnivaluedBinaryTree965 {
    public boolean isUnivalTree(TreeNode root){
        boolean left_univalued = root.left == null || root.left.val == root.val && isUnivalTree(root.left);
        boolean right_univalued = root.right == null || root.right.val == root.val && isUnivalTree(root.right);
        return left_univalued && right_univalued;

    }
}

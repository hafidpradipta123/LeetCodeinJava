package org.LeetCodeExercise.Trees;

public class PathSum112 {
    private boolean isLeafNode(TreeNode node){
        return ((node.left == null) && (node.right == null));
    }

    public boolean hasPathSum(TreeNode root, int targetSum){
        if (root == null){
            return false;
        }

        targetSum -= root.val;
        if(isLeafNode(root)){
            return (targetSum == 0);

        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}

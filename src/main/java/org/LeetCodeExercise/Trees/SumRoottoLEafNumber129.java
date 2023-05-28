package org.LeetCodeExercise.Trees;

public class SumRoottoLEafNumber129 {
    public int sumNumbers(TreeNode root){
        int solution = 0;
        solution = findLeafNodes(root, solution);
        return solution;
    }
    public int findLeafNodes(TreeNode node, int currentPath){
        if (node == null){
            return 0;
        }
        currentPath = (currentPath*10) + node.val;

        if (node.left == null && node.right == null){
            return currentPath;
        }
        return findLeafNodes(node.left, currentPath) + findLeafNodes(node.right, currentPath);
    }
}

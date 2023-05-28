package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthofBinaryTree104Test {

    @Test
    void maxDepth() {
        MaximumDepthofBinaryTree104 formula = new MaximumDepthofBinaryTree104();

        // Create a binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Calculate the maximum depth
        int result = formula.maxDepth(root);

        // Assert the expected result
        assertEquals(3, result);
    }
}
package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterofBinaryTree543Test {

    @Test
    void diameterofBinaryTree() {

        // Create a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        DiameterofBinaryTree543 diameterCalculator = new DiameterofBinaryTree543();
        int diameter = diameterCalculator.diameterofBinaryTree(root);

        // The expected diameter of the binary tree is 3 (path: 4 -> 2 -> 5)
        assertEquals(3, diameter);
    }
}
package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTree226Test {

    @Test
    void invertTree() {

        // Create the input tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Create the expected inverted tree
        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.right = new TreeNode(2);
        expected.left.left = new TreeNode(9);
        expected.left.right = new TreeNode(6);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);

        // Create an instance of the InvertBinaryTree226 class
        InvertBinaryTree226 solution = new InvertBinaryTree226();

        // Call the invertTree method
        TreeNode inverted = solution.invertTree(root);

        // Compare the inverted tree with the expected tree
        assertTreesEqual(expected, inverted);
    }

    private void assertTreesEqual(TreeNode expected, TreeNode actual) {
        if (expected == null && actual == null) {
            return;
        }

        assertNotNull(expected);
        assertNotNull(actual);
        assertEquals(expected.val, actual.val);

        assertTreesEqual(expected.left, actual.left);
        assertTreesEqual(expected.right, actual.right);
    }
}
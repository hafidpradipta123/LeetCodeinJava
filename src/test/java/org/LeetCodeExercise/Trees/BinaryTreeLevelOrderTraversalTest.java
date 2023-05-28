package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    void levelOrder() {
        // Create a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Create an instance of BinaryTreeLevelOrderTraversal
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();

        // Perform level order traversal
        List<List<Integer>> result = traversal.levelOrder(root);

        // Expected level order traversal result
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );

        // Assert that the actual result matches the expected result
        assertEquals(expected, result);
    }
}
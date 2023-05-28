package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryInorderTraversal94Test {

    @Test
    void inorderTraversal() {
        // Create a sample binary tree: [1, null, 2, 3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Create an instance of the class under test
        BinaryInorderTraversal94 binaryInorderTraversal94 = new BinaryInorderTraversal94();

        // Perform the inorder traversal
        List<Integer> result = binaryInorderTraversal94.inorderTraversal(root);

        // Define the expected result
        List<Integer> expected = Arrays.asList(1, 3, 2);

        // Assert the result matches the expected output
        assertEquals(expected, result);
    }
}
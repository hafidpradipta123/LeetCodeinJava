package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryPostOrder145Test {

    @Test
    void postorderTraversal() {
            // Create a binary tree for testing
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            // Create an instance of the class to test
            BinaryPostOrder145 solution = new BinaryPostOrder145();

            // Expected result
            List<Integer> expected = Arrays.asList(4, 5, 2, 3, 1);

            // Call the method to be tested
            List<Integer> result = solution.postorderTraversal(root);

            // Assert the result
            assertEquals(expected, result);

    }
}
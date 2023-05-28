package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryPreorderTarversalRecursive1_144Test {

    @Test
    void preorderTraversal() {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Create an instance of the class
        BinaryPreorderTarversalRecursive1_144 binaryPreorderTraversal = new BinaryPreorderTarversalRecursive1_144();

        // Call the method
        List<Integer> result = binaryPreorderTraversal.preorderTraversal(root);

        // Assert the expected output
        List<Integer> expected = Arrays.asList(1, 2, 4, 5, 3);
        assertEquals(expected, result);
    }

}
package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideView199Test {

    @Test
    void rightSideView() {
        // Create the tree: [1, 2, 3, null, 5, null, 4]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        // Create an instance of BinaryTreeRightSideView199
        BinaryTreeRightSideView199 solution = new BinaryTreeRightSideView199();

        // Call the method being tested
        List<Integer> result = solution.rightSideView(root);

        // Assert the expected output
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, result);
    }

    @Test
    void bfs() {
    }
}
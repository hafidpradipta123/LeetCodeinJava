package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementinBST230Test {

    @Test
    void kthSmalles() {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        KthSmallestElementinBST230 solution = new KthSmallestElementinBST230();

        // Test the kth smallest element for different values of k
        assertEquals(1, solution.kthSmalles(root, 1));
        assertEquals(2, solution.kthSmalles(root, 2));
        assertEquals(3, solution.kthSmalles(root, 3));
        assertEquals(4, solution.kthSmalles(root, 4));
    }
}
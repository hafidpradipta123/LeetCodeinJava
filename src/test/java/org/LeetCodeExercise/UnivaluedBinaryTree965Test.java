package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnivaluedBinaryTree965Test {

    @Test
    void isUnivalTree() {
        UnivaluedBinaryTree965 uni = new UnivaluedBinaryTree965();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        boolean result = uni.isUnivalTree(root);
        assertTrue(result);

    }
    @Test
    void isUnivalTreeFalse() {
        UnivaluedBinaryTree965 uni = new UnivaluedBinaryTree965();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(2);

        boolean result = uni.isUnivalTree(root);
        assertFalse(result);

        }
    }
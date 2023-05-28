package org.LeetCodeExercise.Trees;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceBinaryTree110Test {

    @Test
    void isBalanced() {

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(2);
        root3.left.left = new TreeNode(3);
        root3.left.right = new TreeNode(3);
        root3.left.left.left = new TreeNode(4);
        root3.left.left.right = new TreeNode(4);
        Assert.assertFalse(BalanceBinaryTree110.isBalanced(root3));


        // Test case 1: A balanced binary tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);
        assertTrue(BalanceBinaryTree110.isBalanced(root1));

        // Test case 2: An unbalanced binary tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.left.left.left = new TreeNode(6);
        assertFalse(BalanceBinaryTree110.isBalanced(root2));

    }
}
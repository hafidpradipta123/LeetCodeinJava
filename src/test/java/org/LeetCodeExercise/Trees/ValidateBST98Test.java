package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBST98Test {

    @Test
    void isValidBST() {

        ValidateBST98 validator = new ValidateBST98();

        // Test Case 1: Valid BST
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        assertTrue(validator.isValidBST(root1));

        // Test Case 2: Invalid BST
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        assertFalse(validator.isValidBST(root2));

        // Test Case 3: Empty tree
        TreeNode root3 = null;
        assertTrue(validator.isValidBST(root3));

        // Test Case 4: Single node
        TreeNode root4 = new TreeNode(10);
        assertTrue(validator.isValidBST(root4));
        }
}
package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntoBST701Test {

    @Test
    void insertIntoBST() {

        // Create a sample binary search tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // Create an instance of InsertIntoBST701
        InsertIntoBST701 inserter = new InsertIntoBST701();

        // Insert a new value into the BST
        TreeNode updatedRoot = inserter.insertIntoBST(root, 5);

        // Verify that the new value is inserted correctly
        assertEquals(4, updatedRoot.val); // Root value should remain the same
        assertEquals(2, updatedRoot.left.val); // Left child value should remain the same
        assertEquals(7, updatedRoot.right.val); // Right child value should remain the same
        assertEquals(1, updatedRoot.left.left.val); // Left grandchild value should remain the same
        assertEquals(3, updatedRoot.left.right.val); // Right grandchild value should remain the same
        assertEquals(5, updatedRoot.right.left.val); // New value should be inserted as the left child of the right child
    }
}
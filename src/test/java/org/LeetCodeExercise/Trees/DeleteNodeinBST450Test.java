package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeinBST450Test {

    @Test
    void deleteNode() {
            // Create a sample binary search tree
            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(3);
            root.right = new TreeNode(6);
            root.left.left = new TreeNode(2);
            root.left.right = new TreeNode(4);
            root.right.right = new TreeNode(7);

            // Create an instance of DeleteNodeinBST450
            DeleteNodeinBST450 bst = new DeleteNodeinBST450();

            // Test deleting a node with key = 3
            TreeNode newRoot = bst.deleteNode(root, 3);
            assertEquals(5, newRoot.val);
            assertEquals(2, newRoot.left.val);
            assertEquals(4, newRoot.left.right.val);
            assertEquals(6, newRoot.right.val);
            assertEquals(7, newRoot.right.right.val);
            assertNull(newRoot.left.left);

            // Test deleting a node with key = 5
            newRoot = bst.deleteNode(newRoot, 5);
            assertEquals(6, newRoot.val);
            assertEquals(2, newRoot.left.val);
            assertEquals(4, newRoot.left.right.val);
            assertEquals(7, newRoot.right.val);
            assertNull(newRoot.right.right);
            assertNull(newRoot.left.left);
        }
}
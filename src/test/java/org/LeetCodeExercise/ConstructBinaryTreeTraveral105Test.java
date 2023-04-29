package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeTraveral105Test {

    @Test
    void buildTree() {

        ConstructBinaryTreeTraveral105 treeBuilder = new ConstructBinaryTreeTraveral105();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = treeBuilder.buildTree(preorder, inorder);

        // Verify the root node value and its left and right children
        assertEquals(3, root.val);
        assertEquals(9, root.left.val);
        assertEquals(20, root.right.val);

        // Verify the left child of the right subtree
        assertEquals(15, root.right.left.val);

        // Verify the right child of the right subtree
        assertEquals(7, root.right.right.val);
    }

    @Test
    void helper() {
    }
}
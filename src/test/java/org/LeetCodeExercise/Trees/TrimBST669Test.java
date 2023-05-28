package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrimBST669Test {

    @Test
    void trimBST() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(1);

        TrimBST669 trimBST = new TrimBST669();

        // Trim the tree
        TreeNode trimmedTree = trimBST.trimBST(root, 1, 3);

        // Verify the expected tree structure
        assertEquals(3, trimmedTree.val);
        assertEquals(2, trimmedTree.left.val);
        assertEquals(1, trimmedTree.left.left.val);
        assertNull(trimmedTree.left.right);
        assertNull(trimmedTree.right);
    }
}
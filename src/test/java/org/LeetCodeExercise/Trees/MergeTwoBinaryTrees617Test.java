package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoBinaryTrees617Test {

    @Test
    void mergeTrees() {
        // Create the first tree: [1, 3, 2, 5]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        // Create the second tree: [2, 1, 3, null, 4, null, 7]
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        // Expected merged tree: [3, 4, 5, 5, 4, null, 7]
        TreeNode expectedMergedTree = new TreeNode(3);
        expectedMergedTree.left = new TreeNode(4);
        expectedMergedTree.right = new TreeNode(5);
        expectedMergedTree.left.left = new TreeNode(5);
        expectedMergedTree.left.right = new TreeNode(4);
        expectedMergedTree.right.right = new TreeNode(7);

        MergeTwoBinaryTrees617 merger = new MergeTwoBinaryTrees617();
        TreeNode mergedTree = merger.mergeTrees(root1, root2);

        // Assert the merged tree is equal to the expected merged tree
        assertEquals(expectedMergedTree, mergedTree);
    }
}
package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPossibleFullBinaryTrees894Test {

    @Test
    void testClone() {
    }

    @Test
    void allPossibleFBT() {
        AllPossibleFullBinaryTrees894 solution = new AllPossibleFullBinaryTrees894();
        int n = 7;
        List<TreeNode> result = solution.allPossibleFBT(n);

        // Check the size of the returned list
        assertEquals(5, result.size());

        // Validate each TreeNode in the list
        for (TreeNode tree : result) {
            assertNotNull(tree);
            validateTreeNode(tree);
        }


    }
    private void validateTreeNode(TreeNode tree) {
        if (tree == null) {
            return;
        }

        // Ensure that the tree node has a value
        assertNotNull(tree.val);

        // Recursively validate the left and right subtrees
        validateTreeNode(tree.left);
        validateTreeNode(tree.right);
    }
}
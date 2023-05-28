package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeofAnotherTree572Test {

    @Test
    void isSubtree() {
        // Create the main tree
        TreeNode mainRoot = new TreeNode(3);
        mainRoot.left = new TreeNode(4);
        mainRoot.right = new TreeNode(5);
        mainRoot.left.left = new TreeNode(1);
        mainRoot.left.right = new TreeNode(2);

        // Create the subtree
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        SubtreeofAnotherTree572 solution = new SubtreeofAnotherTree572();

        assertTrue(solution.isSubtree(mainRoot, subRoot));
    }

    @Test
    public void testIsSubtree_NullInput() {
        // Create the main tree
        TreeNode mainRoot = new TreeNode(3);
        mainRoot.left = new TreeNode(4);
        mainRoot.right = new TreeNode(5);

        // Create the sub tree (null)
        TreeNode subRoot = null;

        SubtreeofAnotherTree572 solution = new SubtreeofAnotherTree572();

        assertTrue(solution.isSubtree(mainRoot, subRoot));
    }

    @Test
    public void testIsSubtree_NotSubtree() {
        // Create the main tree
        TreeNode mainRoot = new TreeNode(3);
        mainRoot.left = new TreeNode(4);
        mainRoot.right = new TreeNode(5);
        mainRoot.left.left = new TreeNode(1);
        mainRoot.left.right = new TreeNode(2);

        // Create the sub tree
        TreeNode subRoot = new TreeNode(6);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        SubtreeofAnotherTree572 solution = new SubtreeofAnotherTree572();

        assertFalse(solution.isSubtree(mainRoot, subRoot));
    }
}
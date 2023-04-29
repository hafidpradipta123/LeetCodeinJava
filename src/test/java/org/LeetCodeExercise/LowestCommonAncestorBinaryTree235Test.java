package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorBinaryTree235Test {

    @Test
    void lowestCommonAncestor() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        LowestCommonAncestorBinaryTree235 lca = new LowestCommonAncestorBinaryTree235();
        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(9);
        TreeNode result = lca.lowestCommonAncestor(root,p,q);
        assertEquals(6,result.val );

    }
}
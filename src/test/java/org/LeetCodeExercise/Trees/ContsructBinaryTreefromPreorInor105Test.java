package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContsructBinaryTreefromPreorInor105Test {

    @Test
    void buildTree() {
        ContsructBinaryTreefromPreorInor105 formula = new ContsructBinaryTreefromPreorInor105();
        int[] preorder = {1, 2, 4, 5, 3, 6};
        int[] inorder = {4, 2, 5, 1, 6, 3};

        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.left.left = new TreeNode(4);
        expected.left.right = new TreeNode(5);
        expected.right = new TreeNode(3);
        expected.right.left = new TreeNode(6);

        TreeNode result = formula.buildTree(preorder, inorder);

        assertTrue(isSameTree(expected, result));
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}



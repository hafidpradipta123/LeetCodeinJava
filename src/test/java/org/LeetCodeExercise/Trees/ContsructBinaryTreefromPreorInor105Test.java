package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContsructBinaryTreefromPreorInor105Test {

    @Test
    void buildTree() {
        ContsructBinaryTreefromPreorInor105 formula = new ContsructBinaryTreefromPreorInor105();
        int[] preorder = {6, 2, 1, 4, 3,5,7,9,8};
        int[] inorder = {1,2,3,4,5,6,7,8,9};

        TreeNode expected = new TreeNode(6);
        expected.left = new TreeNode(2);
        expected.left.left = new TreeNode(1);
        expected.left.right = new TreeNode(4);
        expected.left.right.left = new TreeNode(3);
        expected.left.right.right = new TreeNode(5);
        expected.right = new TreeNode(7);
        expected.right.right = new TreeNode(9);
        expected.right.right.left = new TreeNode(8);

        TreeNode result = formula.buildTree(preorder, inorder);

        assertTrue(isSameTree(expected, result));
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}



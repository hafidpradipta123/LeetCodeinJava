package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTree1448Test {

    @Test
    void goodNodes() {
        CountGoodNodesInBinaryTree1448 formula = new CountGoodNodesInBinaryTree1448();
        /*
                 3
                / \
               1   4
              /   / \
             3   1   5
        */
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(1);
            root.left.left = new TreeNode(3);
            root.right = new TreeNode(4);
            root.right.left = new TreeNode(1);
            root.right.right = new TreeNode(5);

            int expected = 4;
            int actual = formula.goodNodes(root);

            assertEquals(expected, actual);

    }

    @Test
    void helper() {
    }
}
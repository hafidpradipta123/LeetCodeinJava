package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCoinInBinaryTree979Test {

    @Test
    void distributeCoin() {
        DistributeCoinInBinaryTree979 distcoin = new DistributeCoinInBinaryTree979();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);

        int result = distcoin.distributeCoin(root);

        assertEquals(2, result);



    }

    @Test
    void give_coins() {
    }
}
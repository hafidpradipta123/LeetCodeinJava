package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRoottoLEafNumber129Test {

    @Test
    void sumNumbers() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        SumRoottoLEafNumber129 solution = new SumRoottoLEafNumber129();
        int result = solution.sumNumbers(root);

        // Expected sum: 12 + 13 = 25
        int expected = 25;

        assertEquals(expected, result);
    }

    @Test
    void findLeafNodes() {
    }
}
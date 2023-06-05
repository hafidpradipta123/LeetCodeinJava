package org.LeetCodeExercise.Trees;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArraytoBST108Test {

    @Test
    void sortedArraytoBST() {
        ConvertSortedArraytoBST108 solution = new ConvertSortedArraytoBST108();
        int[] nums = {-10,-3,0,5,9};
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-10);
        expected.left.right = new TreeNode(-3);
        expected.right = new TreeNode(9);
        expected.right.right = new TreeNode(5);
        TreeNode result = solution.sortedArrayToBST(nums);
        assertTrue(isTreeEqual(expected, result));
    }

    private boolean isTreeEqual(TreeNode expected, TreeNode actual) {
        if (expected == null && actual == null) {
            return true;
        }
        if (expected == null || actual == null) {
            return false;
        }
        if (expected.val != actual.val) {
            return false;
        }
        return isTreeEqual(expected.left, actual.left) && isTreeEqual(expected.right, actual.right);

    }
}
package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindLargestValueInEachTree515Test {

    @Test
    void largestValues() {

        FindLargestValueInEachTree515 solution = new FindLargestValueInEachTree515();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(9);

        List<Integer> result = solution.largestValues(root);

        assertEquals(1, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(9, result.get(2));



    }

    @Test
    void helper_DFS() {
    }
}
package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.MergeTwoBinaryTrees;
import org.LeetCodeExercise.Unclassified.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeTwoBinaryTreesTest {

    @Test
    void mergeTrees() {
        // Build tree 1: [1,3,2,5]
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        // Build tree 2: [2,1,3,null,4,null,7]
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        // Merge trees
        MergeTwoBinaryTrees merger = new MergeTwoBinaryTrees();
        TreeNode result = merger.mergeTrees(t1, t2);

        // Verify merged tree in pre-order traversal
        int[] expected = {3, 4, 5, 5, 4, 7};
        int[] actual = treeToArrayPreOrder(result);
        assertArrayEquals(expected, actual);
    }

    private int[] treeToArrayPreOrder(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        treeToArrayPreOrderHelper(node, list);
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void treeToArrayPreOrderHelper(TreeNode node, List<Integer> list) {
        if (node == null) {
            list.add(null);
        } else {
            list.add(node.val);
            treeToArrayPreOrderHelper(node.left, list);
            treeToArrayPreOrderHelper(node.right, list);
        }
    }
}



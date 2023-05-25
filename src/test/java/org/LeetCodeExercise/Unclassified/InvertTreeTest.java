package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.InvertBinaryTree226;
import org.LeetCodeExercise.Unclassified.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InvertTreeTest {

    @Test
    void invertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Invert the tree using the InvertTree code
        InvertBinaryTree226 it = new InvertBinaryTree226();
        TreeNode inverted = it.invertTree(root);

        // Check that the tree was inverted correctly
        Assertions.assertEquals(4, inverted.val);
        Assertions.assertEquals(7, inverted.left.val);
        Assertions.assertEquals(2, inverted.right.val);
        Assertions.assertEquals(9, inverted.left.left.val);
        Assertions.assertEquals(6, inverted.left.right.val);
        Assertions.assertEquals(3, inverted.right.left.val);
        Assertions.assertEquals(1, inverted.right.right.val);
    }
}
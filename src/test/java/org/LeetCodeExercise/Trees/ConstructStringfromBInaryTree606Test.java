package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructStringfromBInaryTree606Test {

    @Test
    void tree2str() {
            // Create the tree: 1(2(4))(3)
            TreeNode root = new TreeNode(1);
            TreeNode node2 = new TreeNode(2);
            TreeNode node3 = new TreeNode(3);
            TreeNode node4 = new TreeNode(4);
            root.left = node2;
            root.right = node3;
            node2.left = node4;

            ConstructStringfromBInaryTree606 converter = new ConstructStringfromBInaryTree606();
            String expected = "1(2(4))(3)";
            String result = converter.tree2str(root);

            assertEquals(expected, result);
        }
}
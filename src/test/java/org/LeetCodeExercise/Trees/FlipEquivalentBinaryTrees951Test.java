package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipEquivalentBinaryTrees951Test {

    @Test
    void flipEquiv() {

            // Create the first binary tree
            TreeNode root1 = new TreeNode(1);
            root1.left = new TreeNode(2);
            root1.right = new TreeNode(3);
            root1.left.left = new TreeNode(4);
            root1.left.right = new TreeNode(5);
            root1.right.left = new TreeNode(6);
            root1.left.right.left = new TreeNode(7);
            root1.left.right.right = new TreeNode(8);

            // Create the second binary tree with equivalent structure but different values
            TreeNode root2 = new TreeNode(1);
            root2.left = new TreeNode(3);
            root2.right = new TreeNode(2);
            root2.right.left = new TreeNode(4);
            root2.right.right = new TreeNode(5);
            root2.left.right = new TreeNode(6);
            root2.right.right.left = new TreeNode(8);
            root2.right.right.right = new TreeNode(7);

            // Create an instance of the class under test
            FlipEquivalentBinaryTrees951 solution = new FlipEquivalentBinaryTrees951();

            // Perform the test
            assertTrue(solution.flipEquiv(root1, root2));
        }
    }

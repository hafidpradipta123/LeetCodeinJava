package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTree100Test {

    @Test
    void isSameTree() {

        SameTree100 formula = new SameTree100();



        // Test Case 1: Two empty trees should be considered the same
        assertTrue(formula.isSameTree(null, null));

        // Test Case 2: One tree is empty, the other is not. Should return false.
        TreeNode tree1 = new TreeNode(1);
        assertFalse(formula.isSameTree(null, tree1));

        // Test Case 3: The values of the nodes are different. Should return false.
        TreeNode tree2 = new TreeNode(2);
        assertFalse(formula.isSameTree(tree1, tree2));

        // Test Case 4: The values of the nodes are the same, but the structures are different. Should return false.
        tree1.left = new TreeNode(2);
        assertFalse(formula.isSameTree(tree1, tree2));

        // Test Case 5: The values and structures of the trees are the same. Should return true.
        tree2.left = new TreeNode(2);
        assertTrue(formula.isSameTree(tree1, tree2));
     }
    }

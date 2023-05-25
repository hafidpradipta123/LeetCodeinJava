package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.SymmetricTree101;
import org.LeetCodeExercise.Unclassified.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTree101Test {

    @Test
    void isSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        SymmetricTree101 st = new SymmetricTree101();
        assertTrue(st.isSymmetric(root));

    }

    @Test
    void isMirror() {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        SymmetricTree101 st = new SymmetricTree101();
        assertTrue(st.isMirror(root, root));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        //assertFalse(st.isMirror(root, root2));
    }
}
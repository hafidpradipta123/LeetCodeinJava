package org.LeetCodeExercise;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindBottomLeftTreeValues513Test {

    @Test
    void findBottomLeftValue() {
        FindBottomLeftTreeValues513 formula = new FindBottomLeftTreeValues513();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);

        int expected = 7;
        int result = formula.findBottomLeftValue(root);
        assertEquals(expected, result);


    }
}
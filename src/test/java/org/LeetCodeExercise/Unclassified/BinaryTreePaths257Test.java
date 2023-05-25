package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.BinaryTreePaths257;
import org.LeetCodeExercise.Unclassified.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePaths257Test {


    @Test
    void binaryTreePathsOri() {
        BinaryTreePaths257 btp = new BinaryTreePaths257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);


        List<String> expected = List.of("1->2->5","1->3");
        List<String> actual = btp.binaryTreePaths(root);

        assertEquals(expected, actual);


    } @Test
    void binaryTreePathsAddedInput() {
        BinaryTreePaths257 btp = new BinaryTreePaths257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(9);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(10);
        root.right.right.left = new TreeNode(12);


        List<String> expected = List.of("1->2->7","1->2->5->9", "1->3->10->12");
        List<String> actual = btp.binaryTreePaths(root);

        assertEquals(expected, actual);


    }

    @Test
    void dfs() {
        BinaryTreePaths257 btp = new BinaryTreePaths257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<String> expected = List.of("1->2->4", "1->2->5");
        List<String> actual = new ArrayList<>();
        btp.dfs(root.left, "1", actual);

        assertEquals(expected, actual);

    }
}
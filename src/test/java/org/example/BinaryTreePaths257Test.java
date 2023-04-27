package org.example;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePaths257Test {

    @Test
    void binaryTreePaths() {
        BinaryTreePaths257 btp = new BinaryTreePaths257();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> expected = List.of("1->2->5", "1->3");
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
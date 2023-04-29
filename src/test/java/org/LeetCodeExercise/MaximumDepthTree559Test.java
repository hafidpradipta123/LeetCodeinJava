package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthTree559Test {


    @Test
    public void testMaxDepthBFS() {
        Node root = buildTree();
        MaximumDepthTree559 tree = new MaximumDepthTree559();
        int actualDepth = tree.maxDepthBFS(root);
        assertEquals(5, actualDepth);
    }

    @Test
    public void testMaxDepthDFS() {
        Node root = buildTree();
        MaximumDepthTree559 tree = new MaximumDepthTree559();
        int actualDepth = tree.maxDepthDFS(root);
        assertEquals(5, actualDepth);
    }

    private Node buildTree() {
        Node root = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        Node node4 = new Node(4, null);
        Node node5 = new Node(5, null);
        Node node6 = new Node(6, null);
        Node node7 = new Node(7, null);
        Node node8 = new Node(8, null);
        Node node9 = new Node(9, null);
        Node node10 = new Node(10, null);
        Node node11 = new Node(11, null);
        Node node12 = new Node(12, null);
        Node node13 = new Node(13, null);
        Node node14 = new Node(14, null);

        root.children = new ArrayList<>();
        root.children.add(null);
        root.children.add(node2);
        root.children.add(node3);

        node2.children = new ArrayList<>();
        node2.children.add(node4);
        node2.children.add(node5);

        node3.children = new ArrayList<>();
        node3.children.add(null);
        node3.children.add(node6);
        node3.children.add(node7);

        node5.children = new ArrayList<>();
        node5.children.add(node8);

        node7.children = new ArrayList<>();
        node7.children.add(null);
        node7.children.add(node9);

        node8.children = new ArrayList<>();
        node8.children.add(node10);

        node9.children = new ArrayList<>();
        node9.children.add(null);
        node9.children.add(node11);

        node10.children = new ArrayList<>();
        node10.children.add(null);
        node10.children.add(node12);

        node11.children = new ArrayList<>();
        node11.children.add(null);
        node11.children.add(node13);

        node12.children = new ArrayList<>();
        node12.children.add(node14);

        return root;
    }


}
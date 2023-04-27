package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal144 {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output_arr = new LinkedList<>();

        if (root == null) {
            return output_arr;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            if (node != null) {
                output_arr.add(node.val);
                if (node.children != null) {
                    Collections.reverse(node.children); // the difference between postorder and preorder
                    for (Node child : node.children) {
                        stack.add(child);
                    }
                }


            }
        }
        return output_arr;
    }
}

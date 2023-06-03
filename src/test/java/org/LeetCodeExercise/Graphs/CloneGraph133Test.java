package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneGraph133Test {

    @Test
    public void testCloneGraph() {
        // Create nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Add neighbors
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        // Create expected result
        Node expectedNode1 = new Node(1);
        Node expectedNode2 = new Node(2);
        Node expectedNode3 = new Node(3);
        Node expectedNode4 = new Node(4);

        expectedNode1.neighbors.add(expectedNode2);
        expectedNode1.neighbors.add(expectedNode4);
        expectedNode2.neighbors.add(expectedNode1);
        expectedNode2.neighbors.add(expectedNode3);
        expectedNode3.neighbors.add(expectedNode2);
        expectedNode3.neighbors.add(expectedNode4);
        expectedNode4.neighbors.add(expectedNode1);
        expectedNode4.neighbors.add(expectedNode3);

        // Create the instance of the CloneGraph133 class
        CloneGraph133 cloneGraph = new CloneGraph133();

        // Clone the graph
        Node clonedNode1 = cloneGraph.cloneGraph(node1);

        // Check if the cloned graph matches the expected result
        assertTrue(areGraphsEqual(clonedNode1, expectedNode1));
    }

    private boolean areGraphsEqual(Node node1, Node node2) {
        // Base case: if both nodes are null, they are equal
        if (node1 == null && node2 == null) {
            return true;
        }

        // If one node is null and the other is not, they are not equal
        if (node1 == null || node2 == null) {
            return false;
        }

        // If the values are different, they are not equal
        if (node1.val != node2.val) {
            return false;
        }

        // If the number of neighbors is different, they are not equal
        if (node1.neighbors.size() != node2.neighbors.size()) {
            return false;
        }

        // Recursively check if all neighbors are equal
        for (int i = 0; i < node1.neighbors.size(); i++) {
            if (!areGraphsEqual(node1.neighbors.get(i), node2.neighbors.get(i))) {
                return false;
            }
        }

        // All checks passed, the graphs are equal
        return true;
    }
}
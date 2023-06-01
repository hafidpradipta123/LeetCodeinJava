package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycle141Test {

    @Test
    void hasCycle() {
            // Create nodes for a linked list without a cycle
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);
            ListNode node4 = new ListNode(4);

            // Connect the nodes
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;

            // Create an instance of the LinkedListCycle141 class
            LinkedListCycle141 linkedListCycle = new LinkedListCycle141();

            // Test the hasCycle method with the linked list without a cycle
            boolean hasCycle = linkedListCycle.hasCycle(node1);

            // Assert that the result is false since there is no cycle
            assertFalse(hasCycle);

            // Create a cycle by connecting the last node to the second node
            node4.next = node2;

            // Test the hasCycle method with the linked list containing a cycle
            hasCycle = linkedListCycle.hasCycle(node1);

            // Assert that the result is true since there is a cycle
            assertTrue(hasCycle);
        }
    }
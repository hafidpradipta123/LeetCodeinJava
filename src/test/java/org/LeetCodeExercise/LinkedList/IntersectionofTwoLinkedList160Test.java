package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionofTwoLinkedList160Test {

    @Test
    void getIntersectionNode() {
        // Create the linked lists
        ListNode commonNode = new ListNode(8);
        ListNode list1 = new ListNode(4);
        list1.next = new ListNode(1);
        list1.next.next = commonNode;
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(1);
        list2.next.next.next = commonNode;
        list2.next.next.next.next = new ListNode(4);
        list2.next.next.next.next.next = new ListNode(5);

        // Create an instance of the IntersectionofTwoLinkedList160 class
        IntersectionofTwoLinkedList160 solution = new IntersectionofTwoLinkedList160();

        // Call the method to get the intersection node
        ListNode intersectionNode = solution.getIntersectionNode(list1, list2);

        // Assert the result
        assertEquals(commonNode, intersectionNode);
    }

}
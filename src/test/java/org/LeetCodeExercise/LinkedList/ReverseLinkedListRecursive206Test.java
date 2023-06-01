package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListRecursive206Test {

    @Test
    void reverseList() {
            // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            // Create an instance of the ReverseLinkedListRecursive206 class
            ReverseLinkedListRecursive206 reverseLinkedList = new ReverseLinkedListRecursive206();

            // Reverse the linked list
            ListNode reversedList = reverseLinkedList.reverseList(head);

            // Check if the linked list is reversed correctly: 5 -> 4 -> 3 -> 2 -> 1
            assertEquals(5, reversedList.val);
            assertEquals(4, reversedList.next.val);
            assertEquals(3, reversedList.next.next.val);
            assertEquals(2, reversedList.next.next.next.val);
            assertEquals(1, reversedList.next.next.next.next.val);
            assertNull(reversedList.next.next.next.next.next);
        }

    @Test
    void rev() {
    }
}
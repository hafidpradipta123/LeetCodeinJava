package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderList143Test {

    @Test
    void reorderList() {

            // Create the input linked list
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);

            // Create the expected output linked list
            ListNode expected = new ListNode(1);
            expected.next = new ListNode(4);
            expected.next.next = new ListNode(2);
            expected.next.next.next = new ListNode(3);

            // Call the reorderList method
            ReorderList143 reorderList = new ReorderList143();
            reorderList.reorderList(head);

            // Compare the actual output with the expected output
            assertTrue(isEqualLinkedList(head, expected));
    }

    private boolean isEqualLinkedList(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1 == null && temp2 == null;
    }
}
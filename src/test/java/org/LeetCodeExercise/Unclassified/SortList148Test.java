package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ListNode;
import org.LeetCodeExercise.Unclassified.SortList148;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortList148Test {

    @Test
    void sortlist() {
        SortList148 sl = new SortList148();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next  = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode result = sl.sortlist(head);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);

        while (result != null && expected != null) {
            assertEquals(expected.val, result.val);
            result = result.next;
            expected = expected.next;
        }
        assertNull(result);
        assertNull(expected);
    }



    @Test
    void merge() {
    }
}
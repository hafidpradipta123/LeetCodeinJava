package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ListNode;
import org.LeetCodeExercise.Unclassified.SwapNodeInPairs24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodeInPairs24Test {


@Test
    void swapPairs() {

        SwapNodeInPairs24 snip = new SwapNodeInPairs24();

        // create input linked list [1,2,3,4]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);


        // expected output linked list [2,1,4,3]
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(3);

        ListNode result = snip.swapPairs(head);

        // assert that the result matches the expected output
        while (result != null && expected != null) {
            assertEquals(expected.val, result.val);
            result = result.next;
            expected = expected.next;
        }
    }

    @Test
    void swapPairs6() {

        SwapNodeInPairs24 snip = new SwapNodeInPairs24();

        // create input linked list [1,2,3,4,5,6]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);


        // expected output linked list [2,1,4,3,6,5]
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(6);
        expected.next.next.next.next.next = new ListNode(5);

        ListNode result = snip.swapPairs(head);

        // assert that the result matches the expected output
        while (result != null && expected != null) {
            assertEquals(expected.val, result.val);
            result = result.next;
            expected = expected.next;
        }
    }

}
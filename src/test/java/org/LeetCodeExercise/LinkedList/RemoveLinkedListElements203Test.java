package org.LeetCodeExercise.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RemoveLinkedListElements203Test {

    @Test
    void removeElements() {
        // Create the linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        RemoveLinkedListElements203 remover = new RemoveLinkedListElements203();
        ListNode result = remover.removeElements(head, val);

        // The linked list after removing nodes with value 6: 1 -> 2 -> 3 -> 4 -> 5
        Assert.assertEquals(1, result.val);
        Assert.assertEquals(2, result.next.val);
        Assert.assertEquals(3, result.next.next.val);
        Assert.assertEquals(4, result.next.next.next.val);
        Assert.assertEquals(5, result.next.next.next.next.val);
        Assert.assertNull(result.next.next.next.next.next);
    }
}
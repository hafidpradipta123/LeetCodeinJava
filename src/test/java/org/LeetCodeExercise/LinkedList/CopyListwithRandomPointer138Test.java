package org.LeetCodeExercise.LinkedList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyListwithRandomPointer138Test {

    @Test
    public void testCopyRandomList() {
        // Create the original linked list with random pointers
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        head.next = node2;
        head.random = node3;
        node2.next = node3;
        node2.random = head;
        node3.next = node4;
        node3.random = node3;
        node4.random = node2;

        // Create an instance of CopyListwithRandomPointer138
        CopyListwithRandomPointer138 solution = new CopyListwithRandomPointer138();

        // Call the copyRandomList method
        Node copy = solution.copyRandomList(head);

        // Verify that the copied list has the same values
        Assert.assertNotSame(head, copy);
        Assert.assertEquals(head.val, copy.val);
        Assert.assertEquals(head.next.val, copy.next.val);
        Assert.assertEquals(head.random.val, copy.random.val);
        Assert.assertEquals(head.next.random.val, copy.next.random.val);
        Assert.assertEquals(head.next.next.val, copy.next.next.val);
        Assert.assertEquals(head.next.next.random.val, copy.next.next.random.val);
        Assert.assertEquals(head.next.next.next.random.val, copy.next.next.next.random.val);

        // Verify that the original list is not modified
        Assert.assertNull(head.next.next.next.next);
        Assert.assertNull(copy.next.next.next.next);
    }
}
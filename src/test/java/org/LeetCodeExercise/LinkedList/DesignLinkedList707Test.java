package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DesignLinkedList707Test {
    @Test
    public void testLinkedListOperations() {
        DesignLinkedList707 linkedList = new DesignLinkedList707();

        // Test addAtHead
        linkedList.addAtHead(3);
        linkedList.addAtHead(10);
        linkedList.addAtHead(11);
        linkedList.addAtHead(12);
        linkedList.addAtHead(13);

        assertEquals(13, linkedList.get(0));

        // Test addAtTail
        linkedList.addAtTail(5);
        linkedList.addAtTail(15);
        linkedList.addAtTail(16);
        linkedList.addAtTail(17);

        assertEquals(12, linkedList.get(1));

        // Test addAtIndex
        linkedList.addAtIndex(1, 23);
        linkedList.addAtIndex(2, 24);
        linkedList.addAtIndex(3, 27);

        assertEquals(23, linkedList.get(1));

        // Test deleteAtIndex
        linkedList.deleteAtIndex(1);
        linkedList.deleteAtIndex(5);
        linkedList.deleteAtIndex(7);

        assertEquals(5, linkedList.get(1));

        // Test get
        assertEquals(3, linkedList.get(0));
        assertEquals(5, linkedList.get(1));
        assertEquals(-1, linkedList.get(2));
    }

    @Test
    public void testdelete() {
        DesignLinkedList707 linkedList = new DesignLinkedList707();

        // Test addAtHead
        linkedList.addAtHead(3);
        linkedList.addAtHead(10);
        linkedList.addAtHead(11);
        linkedList.addAtHead(12);
        linkedList.addAtHead(13);

        linkedList.deleteAtIndex(1);
        linkedList.deleteAtIndex(3);
        linkedList.deleteAtIndex(5);
    }

}
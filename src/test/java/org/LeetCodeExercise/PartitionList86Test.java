package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionList86Test {

    @Test
    void partition() {

                PartitionList86 partitionList = new PartitionList86();
                ListNode head = new ListNode(1);
                head.next = new ListNode(4);
                head.next.next = new ListNode(3);
                head.next.next.next = new ListNode(2);
                head.next.next.next.next = new ListNode(5);
                head.next.next.next.next.next = new ListNode(2);
                int x = 3;

                ListNode result = partitionList.partition(head, x);

                ListNode expected = new ListNode(1);
                expected.next = new ListNode(2);
                expected.next.next = new ListNode(2);
                expected.next.next.next = new ListNode(4);
                expected.next.next.next.next = new ListNode(3);
                expected.next.next.next.next.next = new ListNode(5);

                while (result != null && expected != null) {
                    assertEquals(expected.val, result.val);
                    result = result.next;
                    expected = expected.next;
                }
                assertNull(result);
                assertNull(expected);
            }

}
package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbers2Test {

    @Test
    void addTwoNumbers() {
            // Test case 1: 342 + 465 = 807
            ListNode first = new ListNode(2);
            first.next = new ListNode(4);
            first.next.next = new ListNode(3);

            ListNode second = new ListNode(5);
            second.next = new ListNode(6);
            second.next.next = new ListNode(4);

            ListNode expected = new ListNode(7);
            expected.next = new ListNode(0);
            expected.next.next = new ListNode(8);

            AddTwoNumbers2 addTwoNumbers2 = new AddTwoNumbers2();
            ListNode result = addTwoNumbers2.addTwoNumbers(first, second);

            assertTrue(compareLists(expected, result));

            // Test case 2: 123 + 876 = 999
            first = new ListNode(3);
            first.next = new ListNode(2);
            first.next.next = new ListNode(1);

            second = new ListNode(6);
            second.next = new ListNode(7);
            second.next.next = new ListNode(8);

            expected = new ListNode(9);
            expected.next = new ListNode(9);
            expected.next.next = new ListNode(9);

            result = addTwoNumbers2.addTwoNumbers(first, second);

            assertTrue(compareLists(expected, result));
        }

        private boolean compareLists(ListNode expected, ListNode actual) {
            while (expected != null && actual != null) {
                if (expected.val != actual.val) {
                    return false;
                }
                expected = expected.next;
                actual = actual.next;
            }
            return expected == null && actual == null;
        }
    }

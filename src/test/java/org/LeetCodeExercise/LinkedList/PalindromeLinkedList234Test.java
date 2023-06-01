package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedList234Test {

    @Test
        public void testIsPalindrome_WhenPalindrome_ReturnsTrue() {
            // Create a palindrome list: 1 -> 2 -> 3 -> 2 -> 1
            ListNode head = new ListNode(1);
            ListNode node1 = new ListNode(2);
            ListNode node2 = new ListNode(3);
            ListNode node3 = new ListNode(2);
            ListNode node4 = new ListNode(1);
            head.next = node1;
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;

            PalindromeLinkedList234 palindromeLinkedList = new PalindromeLinkedList234();
            boolean result = palindromeLinkedList.isPalindrome(head);

            assertTrue(result);
    }

    @Test
    void reverse() {
    }
}
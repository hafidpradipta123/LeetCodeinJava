package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isPalindrome1Test {

    @Test
    void isPalindrome() {

            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            ListNode node3 = new ListNode(3);
            ListNode node4 = new ListNode(2);
            ListNode node5 = new ListNode(1);

            node1.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;

            isPalindrome1 palindrome = new isPalindrome1();
            boolean result = palindrome.isPalindrome(node1);

            assertTrue(result);

    }
}
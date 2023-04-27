package org.example;

import java.util.List;

public class ReversedLinkedList {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;

        while (head!= null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }
        return prev;


    }
}

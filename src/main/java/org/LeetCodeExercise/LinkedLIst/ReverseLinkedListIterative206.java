package org.LeetCodeExercise.LinkedLIst;

public class ReverseLinkedListIterative206 {
    public ListNode reverseList (ListNode head){
        ListNode current = head;
        ListNode previous =null;
        ListNode nextCurrent =null;

        while(current != null){
            nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }

        return previous;
    }
}
package org.LeetCodeExercise.LinkedList;

public class MiddleoftheLinkedList876 {
    public ListNode middleNode(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

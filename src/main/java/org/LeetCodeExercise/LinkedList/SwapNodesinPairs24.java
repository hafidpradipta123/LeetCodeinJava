package org.LeetCodeExercise.LinkedList;

public class SwapNodesinPairs24 {
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode p = head.next;
        head.next = swapPairs(head.next.next);
        p.next =head;
        return p;

    }
}

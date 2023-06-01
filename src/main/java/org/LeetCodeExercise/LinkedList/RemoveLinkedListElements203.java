package org.LeetCodeExercise.LinkedList;

public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy , curr = head;
        while(curr != null){
            ListNode nxt = curr.next;

            if(curr.val == val)
                prev.next = nxt;
            else
                prev = curr;

            curr = nxt;

        }
        return dummy.next;
    }
}

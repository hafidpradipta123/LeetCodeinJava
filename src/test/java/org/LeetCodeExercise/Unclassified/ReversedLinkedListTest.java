package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ListNode;
import org.LeetCodeExercise.Unclassified.ReversedLinkedList;
import org.junit.jupiter.api.Test;

class ReversedLinkedListTest {

    @Test
    void reverseList() {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int[] arr = {1, 2, 3, 4, 5};

        for(int i = 0; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        head = head.next;

        ReversedLinkedList rll = new ReversedLinkedList();
        ListNode result = rll.reverseList(head);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }


    }
}
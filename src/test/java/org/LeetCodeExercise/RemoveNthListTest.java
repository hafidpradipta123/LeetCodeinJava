package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

class RemoveNthListTest {

    @Test
    void removeFromEnd() {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int[] arr = {1, 2, 3, 4, 5};

        for(int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        RemoveNthList rm = new RemoveNthList();
        ListNode result = rm.removeFromEnd(head, 2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
package org.LeetCodeExercise.LinkedList;

import java.util.PriorityQueue;

public class SortList148 {
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        ListNode temp = head;
        while(temp.next != null){
            queue.add(temp.val);
            temp = temp.next;
        }
        queue.add(temp.val);
        temp = head;
        while(!queue.isEmpty()){
            temp.val = queue.poll();
            temp = temp.next;
        }
        return head;
    }
}

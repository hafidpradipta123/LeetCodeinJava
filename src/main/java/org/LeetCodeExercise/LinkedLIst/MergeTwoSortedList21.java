package org.LeetCodeExercise.LinkedLIst;

public class MergeTwoSortedList21 {
    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        final ListNode root= new ListNode();
        ListNode prev = root;
        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                prev.next = list1;
                list1 = list1.next;
            } else{
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 != null ? list2: list2;
        return root.next;
    }
}

package org.LeetCodeExercise.LinkedLIst;

public class IntersectionofTwoLinkedList160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode a = headA, b= headB;
        while( a != b){
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        return a;
    }
}

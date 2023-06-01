package org.LeetCodeExercise.LinkedList;

import java.util.HashMap;

public class CopyListwithRandomPointer138 {
    public Node copyRandomList(Node head){
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        while(cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}

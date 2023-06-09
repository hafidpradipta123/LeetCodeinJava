package org.LeetCodeExercise.Unclassified;

import java.util.HashMap;
import java.util.Map;

public class LRUCache146 {
    final Node head = new Node();
    final Node tail = new Node();
    Map<Integer, Node> node_map;
    int cache_capacity;
    public LRUCache146 (int capacity){
        node_map = new HashMap<>(capacity);
        this.cache_capacity = capacity;
        head.next= tail; // this is the double connection
        tail.prev = head;

    }
    public int get (int key){
        int result = -1;
        Node node = node_map.get(key);
        if (node != null){
            result = node.val;
            remove(node);
            add(node);

        }
        return result;


    }

    public void put(int key, int value){ // can add or overwrite
        Node node = node_map.get(key);
        if (node != null){
            remove(node);
            node.val = value;
            add(node);

        } else{
            if(node_map.size() == cache_capacity){
                node_map.remove(tail.prev.key);
                remove(tail.prev);

            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;

            node_map.put(key, new_node);
            add(new_node);

        }

    }
    public void add(Node node){
        Node dummy = head.next;
        node.next = dummy;
        dummy.prev = node;
        head.next = node;
        node.prev = head;

    }

    public void remove(Node node){
        Node next_node = node.next;
        Node prev_node= node.prev;

        next_node.prev = prev_node;
        prev_node.next = next_node;

    }

    class Node{
        int key;
        int val;
        Node prev;
        Node next;

    }
}

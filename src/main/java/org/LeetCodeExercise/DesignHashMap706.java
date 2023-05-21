package org.LeetCodeExercise;


import java.util.List;

public class DesignHashMap706 {
    static final int size = 3; //199997
    static final int mult = 10; // 12582917
    ListNodeHM [] data;

    public DesignHashMap706(){
        this.data = new ListNodeHM[size];
    }

    private int hash (int key){
        return (int) ((long) key * mult % size);
    }
    public void put(int key, int val){
        remove(key);
        int h = hash(key);
        ListNodeHM node = new ListNodeHM(key, val, data[h]);
        data[h] = node;
    }

    public int get (int key){
        int h = hash(key);
        ListNodeHM node = data[h];
        for(; node != null; node = node.next)
            if (node.key == key) return node.val;
            return -1;

    }

    public void remove (int key){
        int h = hash(key);
        ListNodeHM node = data[h];// is ther any node at the data[h
        if (node == null) return;
        if (node.key == key) data[h]= node.next;
        else for (; node.next != null; node = node.next)
            if (node.next.key == key){
                node.next = node.next.next;
                return;
            }


    }
}

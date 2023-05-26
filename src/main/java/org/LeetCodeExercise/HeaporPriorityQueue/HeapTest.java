package org.LeetCodeExercise.HeaporPriorityQueue;

import java.util.PriorityQueue;

public class HeapTest {
    public int MinHeap(int [] numbers) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int number: numbers) maxHeap.add(-number);
        return maxHeap.size();
    }

}

package org.LeetCodeExercise.HeaporPriorityQueue;

import java.util.PriorityQueue;

public class LastStoneWeight1046 {
    public int lastStoneWeight(int [] stones){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone: stones) maxHeap.add(-stone);
        while(maxHeap.size() > 1){
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone1 != stone2) maxHeap.add(stone1-stone2);
        }
        return maxHeap.size() !=0 ? (-maxHeap.remove()) : 0;
    }
}

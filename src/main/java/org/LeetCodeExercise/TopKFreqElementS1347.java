package org.LeetCodeExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElementS1347 {
    public int[] topKFrequenct(int [] nums, int k){
        int [] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>>pq = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (a,b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer, Integer> it : map.entrySet()){
            pq.add(it);
            if (pq.size() > k ) pq.poll();
        }
        int i = k;
        while(!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }
}

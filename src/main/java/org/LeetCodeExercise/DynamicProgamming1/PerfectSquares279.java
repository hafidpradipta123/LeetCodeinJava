package org.LeetCodeExercise.DynamicProgamming1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PerfectSquares279 {
    public int numSquares(int n){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int ans = 0;
        q.offer(n);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size ; i ++){
                int cur = q.poll();
                if (cur == 0) return ans;
                for (int j = 1; j <= cur / j; j ++){
                    if(!visited.contains(cur -j * j)){
                        q.offer(cur -j * j);
                        visited.add(cur - j * j);
                    }
                }
            }
            ans ++;
        }
        return -1;
    }
}

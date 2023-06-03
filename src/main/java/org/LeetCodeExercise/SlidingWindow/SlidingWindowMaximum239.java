package org.LeetCodeExercise.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum239 {
    public int[] maxSlidingWindow(int[] nums, int k){
        int[] ans = new int[nums.length -k + 1];
        int j = 0;
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++){
            if (!q.isEmpty() && q.peekFirst() < i -k + 1)q.pollFirst();
            while(!q.isEmpty() && nums[i] > nums[q.peekLast()]) q.pollLast();
            q.offer(i);
            if (i >= k-1) ans[j++] = nums[q.peekFirst()];
        }
        return ans;
    }
}

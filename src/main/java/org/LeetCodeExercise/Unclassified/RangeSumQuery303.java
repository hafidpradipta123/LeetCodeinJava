package org.LeetCodeExercise.Unclassified;

import java.util.List;

import static java.lang.Math.abs;

public class RangeSumQuery303 {
    int [] preSum;
    public RangeSumQuery303(int [] nums) {
        preSum = nums;
        for (int i = 1; i < preSum.length; i++)
            preSum[i] += preSum[i - 1];
    }

        public int sumRange(int left, int right){
            if (left == 0) return preSum[right];
            return preSum[right] - preSum[left-1];




    }

}

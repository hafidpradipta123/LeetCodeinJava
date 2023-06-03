package org.LeetCodeExercise.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElement658 {
    public List<Integer> findClosestElements(int[] arr, int k, int target){
        int start = 0;
        int end = arr.length -1;
        while( end - start >= k){
            if (Math.abs(arr[start]- target) > Math.abs(arr[end] -target)){
                start++;
            } else{
                end--;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++){
            result.add(arr[i]);
        }
        return result;
    }
}

package org.LeetCodeExercise.Unclassified;

public class ReplaceElementWithGreatestElementonRightSide1299 {

    public int [] replaceElement(int [] arr){
        int rightMax = -1;
        for (int i = arr.length-1; i >= 0; i--){
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;


        }
        return arr;
    }
}

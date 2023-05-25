package org.LeetCodeExercise.Unclassified;

public class LengthofLastWord58 {
    public int lengthOfLastWord(String s){
        int ans = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++){
            ans = arr[i].length();

        }
        return ans;
    }
}

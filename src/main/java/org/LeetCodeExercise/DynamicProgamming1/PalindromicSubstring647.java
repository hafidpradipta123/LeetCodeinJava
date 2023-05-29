package org.LeetCodeExercise.DynamicProgamming1;

public class PalindromicSubstring647 {
    public int countSubstring(String s){
        if (s.length() < 2){
            return s.length();
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            int left = i, right = i;
            while(
                    left >= 0 &&
                            right < s.length() &&
                            s.charAt(left) == s.charAt(right)
            ){
                result++;
                left--;
                right++;
            }
            //Even Length
            left = i;
            right = i + 1;
            while(
                    left >= 0 &&
                            right < s.length() &&
                            s.charAt(left) == s.charAt(right)
            ){
                result++;
                left--;
                right++;
            }
        }
        return result;
    }
}

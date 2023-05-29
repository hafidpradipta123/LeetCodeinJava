package org.LeetCodeExercise.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubString(String s){
        List<Character> substringL = new ArrayList<>();
        int largestlength = 0;
        for(int right = 0; right < s.length(); right++){
            if(substringL.contains(s.charAt(right))){
                int index = substringL.indexOf(s.charAt(right));
                substringL.remove(index);
                if(index > 0)
                    substringL.subList(0, index).clear();
            }
            substringL.add(s.charAt(right));
            largestlength = Math.max(largestlength, substringL.size());
        }
        return largestlength;
    }
}

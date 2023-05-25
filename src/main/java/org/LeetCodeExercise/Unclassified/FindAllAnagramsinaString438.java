package org.LeetCodeExercise.Unclassified;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString438 {
    public List<Integer> findAnagram(String s, String p ) {
        List<Integer> result = new ArrayList();
        if (s.length() == 0 || s == null) return result;
        int [] char_counts = new int[26];
        for (char c: p.toCharArray()){
            char_counts[c - 'a']++;//ascii values
        }
        int left = 0;
        int right = 0;
        int count = p.length();
        while (right < s.length()){
            if (char_counts[s.charAt(right++)-'a']-- >= 1) count--;

            if(count == 0) result.add(left);
            if(right - left == p.length() && char_counts[s.charAt(left++)]++ >= 0) count ++;


        }
        return result;

    }

}

package org.LeetCodeExercise.Unclassified;

import java.util.HashSet;
import java.util.Set;

public class CheckifAStringContainsAllBinary1461 {
    public boolean hasAllCodes(String s, int k){
        Set<String> codes  = new HashSet<>();
        int total  = 1 << k;

        for (int i = 0; i + k <= s.length(); i++){
            codes.add(s.substring(i, i+k));
            if (codes.size() == total) return true;
        }

        return false;
    }
}

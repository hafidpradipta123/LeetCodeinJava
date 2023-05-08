package org.LeetCodeExercise;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurences1207 {
    public boolean uniqueOccurences (int [] arr){
        HashMap<Integer, Integer> num_occurences = new HashMap<>();
        for (int num : arr){
            num_occurences.put(num, num_occurences.getOrDefault(num,0) +1);
        }
        HashSet<Integer> unique_vals = new HashSet<>(num_occurences.values());
        return num_occurences.size() == unique_vals.size();
    }
}

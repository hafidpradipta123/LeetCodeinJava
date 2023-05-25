package org.LeetCodeExercise.Unclassified;

public class MaximumNumberofBalloon1189 {
    public int maxNumberOfBalloons(String text){
        int [] char_counts = new int[26];
        for (int i = 0; i < text.length(); i++){
            char_counts[text.charAt(i)- 'a']++;


        }
        int min = char_counts[1];//b
        min = Math.min(min, char_counts[0]);
        min = Math.min(min, char_counts[11]/2);
        min = Math.min(min, char_counts[14]/2);
        min = Math.min(min, char_counts[13]);
        return min;

    }
}

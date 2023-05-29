package org.LeetCodeExercise.SlidingWindow;

public class MinimumNumberofFlipsToMakeBinaryString1888 {
    public int minFlips(String s){
        int n = s.length();

        int minimumFlip = Integer.MAX_VALUE;
        int misMatchCount = 0;
        for (int i = 0; i < (2 * n); i ++){
            int r = i % n;

            // add mis watch count in current window
            if ((s.charAt(r) - '0') != (i % 2 == 0 ? 1: 0)) misMatchCount++;

            if (i >= n && (s.charAt(r) - '0') != (r % 2 == 0 ? 1 : 0)) misMatchCount--;

            if (i >= n -1) minimumFlip = Math.min(minimumFlip, Math.min(misMatchCount, n - misMatchCount));
        }
        return minimumFlip;
    }
}

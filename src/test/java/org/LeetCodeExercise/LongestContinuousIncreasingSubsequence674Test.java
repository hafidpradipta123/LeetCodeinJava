package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestContinuousIncreasingSubsequence674Test {

    @Test
    void findLengthOfLCIS() {
        LongestContinuousIncreasingSubsequence674 formula = new LongestContinuousIncreasingSubsequence674();
        int [] input = {1,3,5,4,7} ;
        int result = formula.findLengthOfLCIS(input);
        assertEquals(3,result);


    }
    @Test
    void findLengthOfLCIS2() {
        LongestContinuousIncreasingSubsequence674 formula = new LongestContinuousIncreasingSubsequence674();
        int [] input = {1,3,5,4,7,8,9,10,11,23,55,67,88,12,23,45,} ;
        int result = formula.findLengthOfLCIS(input);
        assertEquals(10,result);


    }


}
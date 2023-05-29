package org.LeetCodeExercise.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberofSubarraysofSizeKandAverageGreater1343Test {

    @Test
    void numOfSubarrays() {
        NumberofSubarraysofSizeKandAverageGreater1343 formula = new NumberofSubarraysofSizeKandAverageGreater1343();
        int [] arr = {2,2,2,2,5,5,5,6};
        int k = 3;
        int threshold = 4;
        int expected = 3;

        int result = formula.numOfSubarrays(arr,k,threshold);
        assertEquals(expected,result);
    }
}
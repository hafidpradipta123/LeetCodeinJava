package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.TopKFreqElementS1347;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFreqElementS1347Test {

    @Test
    void topKFrequency() {
        TopKFreqElementS1347 formula = new TopKFreqElementS1347();
        int [] input = {1,1,1,2,2,3,4,4,5,5,5,5,5,5,5,6,6};
        int [] expected = {1, 2};
        int [] result = formula.topKFrequency(input,2);
        assertArrayEquals(expected,result);
    }
}
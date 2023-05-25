package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.TopKFreqElementS2347;
import org.junit.jupiter.api.Test;

class TopKFreqElementS2347Test {

    @Test
    void topKFrequenct() {
        TopKFreqElementS2347 formula = new TopKFreqElementS2347();
        int [] input = {1,1,1,2,2,3};
        int [] expected = {1, 2};
        int [] result = formula.topKFrequenct(input,2);
    }
}
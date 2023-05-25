package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.TopKFreqElementS3347;
import org.junit.jupiter.api.Test;

class TopKFreqElementS3347Test {

    @Test
    void topKFrequent() {
        TopKFreqElementS3347 formula = new TopKFreqElementS3347();
        int [] input = {1,1,1,2,2,3};
        int [] expected = {1, 2};
        int [] result = formula.topKFrequent(input,2);

    }
}
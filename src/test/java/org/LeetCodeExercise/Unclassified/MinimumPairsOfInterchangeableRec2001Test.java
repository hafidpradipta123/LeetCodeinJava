package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.MinimumPairsOfInterchangeableRec2001;
import org.junit.jupiter.api.Test;

class MinimumPairsOfInterchangeableRec2001Test {

    @Test
    void interchangeableRectangles() {
        MinimumPairsOfInterchangeableRec2001 formula = new MinimumPairsOfInterchangeableRec2001();
        int [][] rect = {{4,8},{3,6},{10,20},{15,30},{44,27},{50,88}};
        int output = 6;
        long result = formula.interchangeableRectangles(rect);
    }
}
package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.MaximumNumberofBalloon1189;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberofBalloon1189Test {

    @Test
    void maxNumberOfBalloons() {
        MaximumNumberofBalloon1189 formula = new MaximumNumberofBalloon1189();
        String input = "loonbalxballpoonbektantanballoonbekanballtanloon";
        int result = formula.maxNumberOfBalloons(input);
        assertEquals(2,result);
    }
}
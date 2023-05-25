package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.UniqueNumberofOccurences1207;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberofOccurences1207Test {

    @Test
    void uniqueOccurences() {
        UniqueNumberofOccurences1207 formula = new UniqueNumberofOccurences1207();
        int [] input = {1,2,2,1,1,3};
        boolean result = formula.uniqueOccurences(input);
        assertTrue(result);
    }
}
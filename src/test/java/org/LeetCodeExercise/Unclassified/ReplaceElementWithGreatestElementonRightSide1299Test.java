package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ReplaceElementWithGreatestElementonRightSide1299;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceElementWithGreatestElementonRightSide1299Test {

    @Test
    void replaceElement() {
        ReplaceElementWithGreatestElementonRightSide1299 formula = new ReplaceElementWithGreatestElementonRightSide1299();
        int [] arr = {18,18,5,4,6,1};
        int [] expected = {18,6,6,6,1,-1};
        int [] result = formula.replaceElement(arr);
        assertArrayEquals(expected,result);
    }
}
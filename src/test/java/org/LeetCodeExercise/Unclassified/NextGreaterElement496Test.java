package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.NextGreaterElement496;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElement496Test {

    @Test
    void nextGreaterElement() {
        NextGreaterElement496 formula = new NextGreaterElement496();
        int [] nums1= {4,1,2};
        int [] nums2 = {1,3,4,2};
        int [] expected = {-1,3,-1};
        int [] result = formula.nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, result);

    }
}
package org.LeetCodeExercise.TwoPointers;

import org.LeetCodeExercise.Unclassified.ProductOfArrayExceptSelf238;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArray88Test {

    @Test
    void merge() {
        MergeSortedArray88 formula = new MergeSortedArray88();
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        int [] expected = {1,2,2,3,5,6};
        formula.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
}
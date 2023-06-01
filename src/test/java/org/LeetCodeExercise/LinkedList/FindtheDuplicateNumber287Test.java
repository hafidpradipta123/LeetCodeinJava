package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindtheDuplicateNumber287Test {

    @Test
    void findDuplicate() {

        FindtheDuplicateNumber287 finder = new FindtheDuplicateNumber287();

        int[] nums1 = {1, 3, 4, 2, 2};
        int expected1 = 2;
        int result1 = finder.findDuplicate(nums1);
        assertEquals(expected1, result1);

        int[] nums2 = {3, 1, 3, 4, 2};
        int expected2 = 3;
        int result2 = finder.findDuplicate(nums2);
        assertEquals(expected2, result2);

        int[] nums3 = {1, 1};
        int expected3 = 1;
        int result3 = finder.findDuplicate(nums3);
        assertEquals(expected3, result3);

        int[] nums4 = {1, 1, 2};
        int expected4 = 1;
        int result4 = finder.findDuplicate(nums4);
        assertEquals(expected4, result4);
    }
}
package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindUniqueBinaryString1980Test {

    @Test
    void findDifferentBinaryString() {
        FindUniqueBinaryString1980 solution = new FindUniqueBinaryString1980();

        // Test Case 1: Single input, expected output is the complement of the input
        String[] nums1 = {"0"};
        String expected1 = "1";
        assertEquals(expected1, solution.findDifferentBinaryString(nums1));

        // Test Case 2: Multiple inputs, expected output is the complement of each input
        String[] nums2 = {"10", "01", "00", "11"};
        String expected2 = "11";
        assertEquals(expected2, solution.findDifferentBinaryString(nums2));

        // Test Case 3: All zeros, expected output is all ones
        String[] nums3 = {"000", "0000", "00000"};
        String expected3 = "111";
        assertEquals(expected3, solution.findDifferentBinaryString(nums3));

        // Test Case 4: All ones, expected output is all zeros
        String[] nums4 = {"111", "1111", "11111"};
        String expected4 = "000";
        assertEquals(expected4, solution.findDifferentBinaryString(nums4));
    }
}
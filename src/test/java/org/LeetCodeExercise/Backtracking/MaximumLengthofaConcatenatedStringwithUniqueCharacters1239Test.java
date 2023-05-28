package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthofaConcatenatedStringwithUniqueCharacters1239Test {

    @Test
    void maxLength() {
        MaximumLengthofaConcatenatedStringwithUniqueCharacters1239 solution = new MaximumLengthofaConcatenatedStringwithUniqueCharacters1239();

        // Test case 1
        List<String> arr1 = new ArrayList<>();
        arr1.add("un");
        arr1.add("ique");
        arr1.add("characters");
        int result1 = solution.maxLength(arr1);
        assertEquals(15, result1);

        // Test case 2
        List<String> arr2 = new ArrayList<>();
        arr2.add("aa");
        arr2.add("bb");
        arr2.add("cc");
        int result2 = solution.maxLength(arr2);
        assertEquals(0, result2);

        // Test case 3
        List<String> arr3 = new ArrayList<>();
        arr3.add("a");
        arr3.add("b");
        arr3.add("c");
        arr3.add("d");
        arr3.add("e");
        int result3 = solution.maxLength(arr3);
        assertEquals(5, result3);
    }
}
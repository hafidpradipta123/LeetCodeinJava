package org.LeetCodeExercise.HeaporPriorityQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorganizeString767Test {

    @Test
    void reorganizeString() {
        ReorganizeString767 reorganizeString = new ReorganizeString767();

        // Test Case 1: Valid input string
        String input1 = "aab";
        String expected1 = "aba";
        String result1 = reorganizeString.reorganizeString(input1);
        assertEquals(expected1, result1);

        // Test Case 2: Valid input string
        String input2 = "aaab";
        String expected2 = "abab";
        String result2 = reorganizeString.reorganizeString(input2);
        assertEquals(expected2, result2);

        // Test Case 3: Invalid input string
        String input3 = "aaabb";
        String expected3 = "";
        String result3 = reorganizeString.reorganizeString(input3);
        assertEquals(expected3, result3);
    }
}
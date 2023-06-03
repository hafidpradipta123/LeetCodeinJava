package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RestoreIPAddress93Test {

    @Test
    void testRestoresIpAddress() {
        RestoreIPAddress93 restoreIPAddress93 = new RestoreIPAddress93();

        // Test case 1
        String input1 = "25525511135";
        List<String> expected1 = Arrays.asList("255.255.11.135", "255.255.111.35");
        List<String> result1 = restoreIPAddress93.restoresIpAddress(input1);
        assertEquals(expected1, result1);

        // Test case 2
        String input2 = "0000";
        List<String> expected2 = Arrays.asList("0.0.0.0");
        List<String> result2 = restoreIPAddress93.restoresIpAddress(input2);
        assertEquals(expected2, result2);

        // Test case 3
        String input3 = "1111";
        List<String> expected3 = Arrays.asList("1.1.1.1");
        List<String> result3 = restoreIPAddress93.restoresIpAddress(input3);
        assertEquals(expected3, result3);

        // Test case 4
        String input4 = "010010";
        List<String> expected4 = Arrays.asList("0.10.0.10", "0.100.1.0");
        List<String> result4 = restoreIPAddress93.restoresIpAddress(input4);
        assertEquals(expected4, result4);
    }

}
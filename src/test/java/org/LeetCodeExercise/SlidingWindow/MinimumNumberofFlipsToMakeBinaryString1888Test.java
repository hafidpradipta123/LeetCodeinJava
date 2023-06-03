package org.LeetCodeExercise.SlidingWindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberofFlipsToMakeBinaryString1888Test {

    @Test
    public void testMinFlips() {
        MinimumNumberofFlipsToMakeBinaryString1888 flipper = new MinimumNumberofFlipsToMakeBinaryString1888();

        // Test case 1: Flips required = 0 (input already all 0s)
        String input1 = "00000";
        int expected1 = 0;
        int actual1 = flipper.minFlips(input1);
        Assertions.assertEquals(expected1, actual1);

        // Test case 2: Flips required = 1 (input already all 1s)
        String input2 = "11111";
        int expected2 = 1;
        int actual2 = flipper.minFlips(input2);
        Assertions.assertEquals(expected2, actual2);

        // Test case 3: Flips required = 2
        String input3 = "01010101";
        int expected3 = 2;
        int actual3 = flipper.minFlips(input3);
        Assertions.assertEquals(expected3, actual3);

        // Test case 4: Flips required = 3
        String input4 = "10101010";
        int expected4 = 3;
        int actual4 = flipper.minFlips(input4);
        Assertions.assertEquals(expected4, actual4);

        // Test case 5: Flips required = 5
        String input5 = "11110000";
        int expected5 = 5;
        int actual5 = flipper.minFlips(input5);
        Assertions.assertEquals(expected5, actual5);
    }
}
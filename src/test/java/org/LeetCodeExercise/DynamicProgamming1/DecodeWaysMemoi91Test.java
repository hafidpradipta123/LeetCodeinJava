package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysMemoi91Test {
    @Test
    public void testNumDecodings() {
        DecodeWaysMemoi91 decoder = new DecodeWaysMemoi91();

        // Test case 1: Example given in the question
        String s1 = "226";
        int expected1 = 3;
        int result1 = decoder.numDecodings(s1);
        Assert.assertEquals(expected1, result1);

        // Test case 2: Empty string
        String s2 = "";
        int expected2 = 0;
        int result2 = decoder.numDecodings(s2);
        Assert.assertEquals(expected2, result2);

        // Test case 3: Single character
        String s3 = "5";
        int expected3 = 1;
        int result3 = decoder.numDecodings(s3);
        Assert.assertEquals(expected3, result3);

        // Test case 4: Only zeros
        String s4 = "000";
        int expected4 = 0;
        int result4 = decoder.numDecodings(s4);
        Assert.assertEquals(expected4, result4);

        // Test case 5: Large input
        String s5 = "11111111111111111111";
        int expected5 = 10946;
        int result5 = decoder.numDecodings(s5);
        Assert.assertEquals(expected5, result5);
    }

}
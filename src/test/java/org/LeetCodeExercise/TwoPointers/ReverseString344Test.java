package org.LeetCodeExercise.TwoPointers;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseString344Test {

    @Test
    void reverseString() {
        ReverseString344 formula = new ReverseString344();
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] expected1 = {'o', 'l', 'l', 'e', 'h'};
        formula.reverseString(s1);
        Assert.assertArrayEquals(expected1, s1);

    }
}
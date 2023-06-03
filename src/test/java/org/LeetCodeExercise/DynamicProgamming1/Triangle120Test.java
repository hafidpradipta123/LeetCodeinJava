package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Triangle120Test {

    @Test
    public void testMinimumTotal() {
        Triangle120 triangle120 = new Triangle120();

        // Create a sample triangle
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );

        // Expected minimum total is 11 (2 + 3 + 5 + 1)
        int expected = 11;

        // Call the method and check the result
        int result = triangle120.minimumTotal(triangle);
        Assert.assertEquals(expected, result);
    }

}
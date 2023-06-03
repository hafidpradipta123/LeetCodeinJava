package org.LeetCodeExercise.SlidingWindow;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindKClosestElement658Test {

    @Test
    public void testFindClosestElements() {
        FindKClosestElement658 solution = new FindKClosestElement658();
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10,11};
        int k = 4;
        int x = 8;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = solution.findClosestElements(arr, k, x);
        Assert.assertEquals(expected, result);
    }
}
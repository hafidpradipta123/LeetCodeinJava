package org.LeetCodeExercise.TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSum15Test {

    @Test
    void threeSum() {
        ThreeSum15 formula = new ThreeSum15();
        int [] input ={-1,0,1,2,-1,4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1,-1,2));
        expected.add(Arrays.asList(-1,-0,1));
        List<List<Integer>> result = formula.threeSum(input);
        assertEquals(expected,result);


        // Test case 2: No valid triplets
        int[] nums2 = {1, 2, 3, 4, 5};
        List<List<Integer>> expected2 = new ArrayList<>();
        List<List<Integer>> result2 = formula.threeSum(nums2);
        assertEquals(expected2, result2);

        // Test case 3: Empty array
        int[] nums3 = {};
        List<List<Integer>> expected3 = new ArrayList<>();
        List<List<Integer>> result3 = formula.threeSum(nums3);
        assertEquals(expected3, result3);


    }
}
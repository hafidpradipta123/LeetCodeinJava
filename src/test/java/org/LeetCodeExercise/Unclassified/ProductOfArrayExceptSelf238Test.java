package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ProductOfArrayExceptSelf238;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelf238Test {

    @Test
    void productExceptSelf() {
        ProductOfArrayExceptSelf238 formula = new ProductOfArrayExceptSelf238();
        int [] input = {1,2,3,4};
        int [] output = {24,12,8,6};
        int [] result = formula.productExceptSelf(input);
        assertArrayEquals(output,result);

    }

    @Test
    void productExceptSElfNumsAsPrefix() {
    }
}
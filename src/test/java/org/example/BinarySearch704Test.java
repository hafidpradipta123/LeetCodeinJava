package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearch704Test {

    @Test
    void search() {

                int[] nums = {-1, 0, 3, 5, 9, 12,21,24,26,34,55,67,89,212};
                int target = 34;

                BinarySearch704 binarySearch = new BinarySearch704();
                int result = binarySearch.search(nums, target);

                assertEquals(9, result);
            }
}
package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitiontoKEqualSumSubsets698Test {

    @Test
    void canPartitionKSubsets() {
    }

    @Test
    void testCanPartitionKSubsets() {
        PartitiontoKEqualSumSubsets698 partitioner = new PartitiontoKEqualSumSubsets698();

        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        boolean result = partitioner.canPartitionKSubsets(nums, k);

        assertTrue(result, "Expected true, but got false");
    }

    @Test
    void canPartitionKSubsets_ReturnsFalse() {
        PartitiontoKEqualSumSubsets698 partitioner = new PartitiontoKEqualSumSubsets698();

        int[] nums = {1, 2, 3, 4};
        int k = 3;
        boolean result = partitioner.canPartitionKSubsets(nums, k);

        assertFalse(result, "Expected false, but got true");
    }
}

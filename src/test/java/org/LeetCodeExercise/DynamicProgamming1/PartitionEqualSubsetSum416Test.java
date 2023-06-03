package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSum416Test {
    @Test
    public void testCanPartition() {
        PartitionEqualSubsetSum416 partitionEqualSubsetSum = new PartitionEqualSubsetSum416();

        // Test case 1: Valid partition
        int[] nums1 = {1, 5, 11, 5};
        assertTrue(partitionEqualSubsetSum.canPartition(nums1));

        // Test case 2: Invalid partition
        int[] nums2 = {1, 2, 3, 5};
        assertFalse(partitionEqualSubsetSum.canPartition(nums2));

        // Test case 3: Empty array
        int[] nums3 = {};
        assertFalse(partitionEqualSubsetSum.canPartition(nums3));

        // Test case 4: Single element
        int[] nums4 = {5};
        assertFalse(partitionEqualSubsetSum.canPartition(nums4));

        // Test case 5: Large numbers
        int[] nums5 = {1000, 2000, 3000, 4000};
        assertTrue(partitionEqualSubsetSum.canPartition(nums5));
    }
}
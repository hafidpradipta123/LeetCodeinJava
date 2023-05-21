package org.LeetCodeExercise;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortAnArray912Test {

    @Test
    void sortArray() {
        SortAnArray912 sorter = new SortAnArray912();
        int[] nums = {15, 11, 11, 12, 10, 10};
        int[] expected = {10, 10, 11, 11, 12, 15};

        int[] result = sorter.SortArray(nums);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    void mergeFunc() {
        int[] arr = {1, 3, 5, 2, 4, 6};
        int l = 0;
        int m = 2;
        int r = 5;
        int[] expected = {1, 2, 3, 4, 5, 6};

        SortAnArray912.mergeFunc(arr, l, m, r);

        Assert.assertArrayEquals(expected, arr);
    }

    @Test
    void mergeSort() {
        int[] arr = {5, 1, 4, 2, 8};
        int low = 0;
        int high = arr.length - 1;
        int[] expected = {1, 2, 4, 5, 8};

        SortAnArray912.mergeSort(arr, low, high);

        Assert.assertArrayEquals(expected, arr);
    }
}
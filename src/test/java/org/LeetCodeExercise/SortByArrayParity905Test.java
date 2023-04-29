package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByArrayParity905Test {

    @Test
    void sortArrayByParity() {
        SortByArrayParity905 sort = new SortByArrayParity905();
        int [] input = {3,2,1,4};
        int[] result = sort.sortArrayByParity905(input);
        int [] expected = {2,4,3,1};
        assertArrayEquals(expected, result);

    }
}
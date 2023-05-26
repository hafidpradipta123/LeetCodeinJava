package org.LeetCodeExercise.HeaporPriorityQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInaStream703Test {

    @Test
    void add() {
        int [] nums = {4,5,8,2};
        KthLargestElementInaStream703 formula = new KthLargestElementInaStream703(3, nums);
        assertEquals(4, formula.add(3));
        assertEquals(5, formula.add(5));
        assertEquals(5, formula.add(10));
        assertEquals(8, formula.add(9));
        assertEquals(8, formula.add(4));
    }
}
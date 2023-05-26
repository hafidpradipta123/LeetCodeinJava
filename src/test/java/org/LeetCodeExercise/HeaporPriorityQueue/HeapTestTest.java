package org.LeetCodeExercise.HeaporPriorityQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTestTest {

    @Test
    void minHeap() {
        HeapTest formula = new HeapTest();
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int abc = formula.MinHeap(numbers);
        assertEquals(3, abc);
    }
}
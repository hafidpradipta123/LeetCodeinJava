package org.LeetCodeExercise.HeaporPriorityQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeight1046Test {

    @Test
    void lastStoneWeight() {
        LastStoneWeight1046 formula = new LastStoneWeight1046();
        int [] stones = {2,7,4,1,8,1};
        int result = formula.lastStoneWeight(stones);
        assertEquals(1,result);

    }
}
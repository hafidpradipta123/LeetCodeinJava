package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrix54Test {

    @Test
    void spiralOrder() {
        SpiralMatrix54 sm = new SpiralMatrix54();
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        List<Integer> actual = sm.spiralOrder(matrix);

        assertEquals(expected, actual);
    }
}
package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelfDividingNumbers728Test {

    @Test
    void selfDividingNumbers() {
        SelfDividingNumbers728 formula = new SelfDividingNumbers728();
        int left = 1;
        int right = 22;
        Integer[] expected = {1,2,3,4,5,6,7,8,9,11,12,15,22};
        List<Integer> output = formula.selfDividingNumbers(left, right);
        assertEquals(List.of(expected), output);

    }

    @Test
    void isSelfDividing() {
    }
}
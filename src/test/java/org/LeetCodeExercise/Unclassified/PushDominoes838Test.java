package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.PushDominoes838;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PushDominoes838Test {

    @Test
    void pushDominoes() {
        PushDominoes838 solution = new PushDominoes838();
        String dominoes = ".L.R...LR..L..";
        String expectedOutput = "LL.RR.LLRRLL..";
        String actualOutput = solution.pushDominoes(dominoes);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
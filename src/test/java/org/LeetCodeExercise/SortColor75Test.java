package org.LeetCodeExercise;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColor75Test {

    @Test
    void sortColors() {
        SortColor75 formula = new SortColor75();
        int [] input = {2,0,2,1,1,0,2,1,2,0,0,1,2};
        int [] expected = {0,0,0,0,1,1,1,1,2,2,2,2,2};
        formula.sortColors(input);
        Assert.assertArrayEquals(expected, input);


    }
}
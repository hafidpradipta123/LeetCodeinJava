package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.FindAllDuplicates442;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicates442Test {

    @Test
    void findDuplicates() {
        FindAllDuplicates442 formula = new FindAllDuplicates442();
        int [] input = {4,3,2,7,8,2,3,1};
        List<Integer> output = Arrays.asList(2,3);
        List<Integer> result= formula.findDuplicates(input);
        assertEquals(output, result);
    }
}
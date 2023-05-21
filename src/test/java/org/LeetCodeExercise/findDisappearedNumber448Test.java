package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class findDisappearedNumber448Test {

    @Test
    void findDisappearNumbers() {
        findDisappearedNumber448 formula = new findDisappearedNumber448();
       int []input  = {4,3,2,7,8,2,3,1};
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(6);
       List<Integer> result = formula.findDisappearNumbers(input);
       assertEquals(expected, result);


    }
}
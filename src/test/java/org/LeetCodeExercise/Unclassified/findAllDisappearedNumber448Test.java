package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.FindAllDisappearedNumber448;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class findAllDisappearedNumber448Test {

    @Test
    void findDisappearNumbers() {
        FindAllDisappearedNumber448 formula = new FindAllDisappearedNumber448();
       int []input  = {4,3,2,7,8,2,3,1};
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(6);
       List<Integer> result = formula.findDisappearNumbers(input);
       assertEquals(expected, result);


    }
}
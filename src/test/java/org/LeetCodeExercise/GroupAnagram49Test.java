package org.LeetCodeExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagram49Test {

    @Test
    void groupAnagrams() {
        GroupAnagram49 formula = new GroupAnagram49();
        String [] Input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = new ArrayList<>();

        expected.add(Arrays.asList("ate", "eat", "tea"));
        expected.add(Arrays.asList("bat"));
        expected.add(Arrays.asList("nat", "tan"));


        List<List<String>> result = formula.groupAnagrams(Input);
        assertEquals(expected.size(), result.size(), "the number of groups is incorrect");

        for (int i = 0; i < expected.size(); i++){
            List<String> expectedGroup = expected.get(i);
            List<String> resultGroup = result.get(i);
            assertEquals(expectedGroup.size(), resultGroup.size(), "the size of group" + i + "is incorrect");
            assertTrue(expectedGroup.containsAll(resultGroup), "The group" + i + "containts incorrect elements");
        }


    }
}
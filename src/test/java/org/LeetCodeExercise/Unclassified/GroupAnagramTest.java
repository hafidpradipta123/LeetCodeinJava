package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.GroupAnagram49;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    @Test
    void groupAnagrams() {
        GroupAnagram49 formula = new GroupAnagram49();
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expectedOutput = Arrays.asList(
                Arrays.asList("bat"),
                Arrays.asList("nat", "tan"),
                Arrays.asList("ate", "eat", "tea")
        );
        List<List<String>> result = formula.groupAnagrams(strs);
        assertEquals(expectedOutput, result);

    }
}
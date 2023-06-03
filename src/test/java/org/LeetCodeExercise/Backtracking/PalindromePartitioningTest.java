package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    @Test
    public void testPartition() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

        String input = "aab";
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList("a", "a", "b"));
        expectedOutput.add(Arrays.asList("aa", "b"));

        List<List<String>> result = palindromePartitioning.partition(input);

        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    public void testPartitionEmptyString() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

        String input = "";
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(new ArrayList<>());

        List<List<String>> result = palindromePartitioning.partition(input);

        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    public void testPartitionSingleCharacter() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

        String input = "a";
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList("a"));

        List<List<String>> result = palindromePartitioning.partition(input);

        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    public void testPartitionAllSameCharacters() {
        PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

        String input = "aaa";
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList("a", "a", "a"));
        expectedOutput.add(Arrays.asList("aa", "a"));
        expectedOutput.add(Arrays.asList("a", "aa"));
        expectedOutput.add(Arrays.asList("aaa"));

        List<List<String>> result = palindromePartitioning.partition(input);

        Assertions.assertEquals(expectedOutput, result);
    }

}
package org.LeetCodeExercise.DynamicProgamming1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreak139Test {

    @Test
    void wordBreak() {
        WordBreak139 wordBreak = new WordBreak139();

        // Test Case 1: Valid word break
        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");
        boolean expected1 = true;
        boolean result1 = wordBreak.wordBreak(s1, wordDict1);
        Assert.assertEquals(expected1, result1);

        // Test Case 2: Invalid word break
        String s2 = "applepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen");
        boolean expected2 = false;
        boolean result2 = wordBreak.wordBreak(s2, wordDict2);
        Assert.assertEquals(expected2, result2);

        // Test Case 3: Empty wordDict
        String s3 = "catsandog";
        List<String> wordDict3 = new ArrayList<>();
        boolean expected3 = false;
        boolean result3 = wordBreak.wordBreak(s3, wordDict3);
        Assert.assertEquals(expected3, result3);
    }
}
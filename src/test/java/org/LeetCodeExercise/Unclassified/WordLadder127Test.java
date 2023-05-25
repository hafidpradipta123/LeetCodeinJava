package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.WordLadder127;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadder127Test {

    @Test
    void ladderLength() {
        WordLadder127 formula = new WordLadder127();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordlist = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result  = formula.ladderLength(beginWord, endWord, wordlist );
        assertEquals(5,result);

    }

    @Test
    void ladderLength2() {
        WordLadder127 formula = new WordLadder127();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordlist = Arrays.asList("hot","dot","dog","lot","log");

        int result  = formula.ladderLength(beginWord, endWord, wordlist );
        assertEquals(0,result);

    }
}
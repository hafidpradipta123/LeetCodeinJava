package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearch79Test {

    @Test
    public void testExist() {
        WordSearch79 wordSearch = new WordSearch79();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertTrue(wordSearch.exist(board, "ABCCED"));
        assertTrue(wordSearch.exist(board, "SEE"));
        assertFalse(wordSearch.exist(board, "ABCB"));
    }

    @Test
    public void testCheck() {
        WordSearch79 wordSearch = new WordSearch79();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertTrue(wordSearch.check(board, "ABCCED", 0, 0, 3, 4, 0));
        assertTrue(wordSearch.check(board, "SEE", 1, 1, 3, 4, 0));
        assertFalse(wordSearch.check(board, "ABCB", 0, 0, 3, 4, 0));
    }

}
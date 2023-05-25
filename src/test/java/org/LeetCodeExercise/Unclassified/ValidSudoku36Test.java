package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.ValidSudoku36;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudoku36Test {

    @Test
    public void testValidSudoku() {
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        ValidSudoku36 validSudoku = new ValidSudoku36();
        boolean result = validSudoku.isValidSudoku(board);
        assertTrue(result);
    }
    @Test
    public void testInvalidSudokuFalse() {
        char[][] board = new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        ValidSudoku36 validSudoku = new ValidSudoku36();
        boolean result = validSudoku.isValidSudoku(board);
        assertFalse(result);
    }
}
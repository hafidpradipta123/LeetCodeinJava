package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckifMoveisLegal1958Test {
    @Test
    public void testCheckMove() {
        CheckifMoveisLegal1958 checker = new CheckifMoveisLegal1958();

        // Test case 1: Legal move
        char[][] board1 = {
                {'.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.'},
                {'.', '.', 'W', 'B', '.', '.'},
                {'.', '.', '.', 'B', '.', '.'},
                {'.', '.', '.', '.', 'B', '.'},
                {'.', '.', '.', '.', '.', '.'}
        };
        int rMove1 = 2;
        int cMove1 = 4;
        char color1 = 'W';
        boolean expected1 = true;
        boolean result1 = checker.checkMove(board1, rMove1, cMove1, color1);
        assertEquals(expected1, result1);

        // Test case 2: Illegal move
        char[][] board2 = {
                {'.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.'},
                {'.', '.', 'W', 'B', '.', '.'},
                {'.', '.', '.', 'B', '.', '.'},
                {'.', '.', '.', '.', 'B', '.'},
                {'.', '.', '.', '.', '.', '.'}
        };
        int rMove2 = 2;
        int cMove2 = 4;
        char color2 = 'B';
        boolean expected2 = false;
        boolean result2 = checker.checkMove(board2, rMove2, cMove2, color2);
        assertEquals(expected2, result2);
    }
}
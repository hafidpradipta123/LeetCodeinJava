package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegionTest {

    @Test
    void solve() {
        
            char[][] board = {
                    {'X', 'X', 'X', 'X'},
                    {'X', 'O', 'O', 'X'},
                    {'X', 'X', 'O', 'X'},
                    {'X', 'O', 'X', 'X'}
            };
            char[][] expectedOutput = {
                    {'X', 'X', 'X', 'X'},
                    {'X', 'X', 'X', 'X'},
                    {'X', 'X', 'X', 'X'},
                    {'X', 'O', 'X', 'X'}
            };
            SurroundedRegion130 sr = new SurroundedRegion130();
            sr.solve(board);
            assertArrayEquals(expectedOutput, board);
    }

    @Test
    void boundaryDFS() {
    }
}
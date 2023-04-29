package org.LeetCodeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurroundedRegion130Test {

    @Test
    void solve() {
        char[][] board = {
                {'X','X','X','X','X','X','X','O'},
                {'X','O','O','X','O','O','X','X'},
                {'X','X','O','X','O','O','X','X'},
                {'X','O','X','X','X','X','O','O'}
        };
        char[][] expected = {
                {'X','X','X','X','X','X','X','O'},
                {'X','X','X','X','X','X','X','X'},
                {'X','X','X','X','X','X','X','X'},
                {'X','O','X','X','X','X','O','O'}
        };
        SurroundedRegion130 solution = new SurroundedRegion130();
        solution.solve(board);
        assertArrayEquals(expected, board);
    }

    @Test
    void boundaryDFS() {

            char[][] board = {
                    {'O','O','O','O'},
                    {'O','X','X','O'},
                    {'O','O','X','O'},
                    {'O','O','O','O'}
            };
            char[][] expected = {
                    {'*','*','*','*'},
                    {'*','X','X','*'},
                    {'*','*','X','*'},
                    {'*','*','*','*'}
            };
            SurroundedRegion130 solution = new SurroundedRegion130();
            solution.boundaryDFS(board, 1, 1);
            assertArrayEquals(expected, board);

    }
}
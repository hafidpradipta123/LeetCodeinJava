package org.LeetCodeExercise;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumofIsland200Test {

    @Test
    void numIslands() {

        char[][] grid = {
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'O','O','X','O','O'},
                {'O','O','O','X','X'}
        };


        NumofIsland200 subject = new NumofIsland200();
        int result = subject.numIslands(grid);
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void callBFS() {
    }


}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumofIslandTest {

    @Test
    void numIslands() {

        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };


        NumofIsland subject = new NumofIsland();
        int result = subject.numIslands(grid);
    }

    @Test
    void callBFS() {
    }
}
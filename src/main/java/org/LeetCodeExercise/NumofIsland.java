package org.LeetCodeExercise;

public class NumofIsland {
    public int numIslands(char[][] grid) {
        int count = 0;
        int reccounter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    callBFS(grid, i, j,reccounter);
                }
            }
        }
        return count;
    }

    public void callBFS(char[][] grid, int i, int j, int reccounter) {
        reccounter += 1;
        boolean isZero = i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0';
        if (!isZero) { //execute if not zero
            grid[i][j] = '0';//start 0,0// line a
            callBFS(grid, i + 1, j, reccounter); //first sequence
            callBFS(grid, i - 1, j,reccounter); //second sequence
            callBFS(grid, i, j + 1,reccounter); //third sequence
            callBFS(grid, i, j - 1,reccounter);//fourth sequence
        }
    }
}

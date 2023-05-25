package org.LeetCodeExercise.Unclassified;

public class NumofIsland200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'X') {
                    count += 1;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }

    public void callBFS(char[][] grid, int i, int j) {
        boolean isO = i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 'O';
        if (!isO) { //execute if not zero
            grid[i][j] = 'O';//start 0,0// line a
            callBFS(grid, i + 1, j); //first sequence below
            callBFS(grid, i - 1, j); //second sequence above
            callBFS(grid, i, j + 1); //third sequence right
            callBFS(grid, i, j - 1);//fourth sequence left
        }
    }
}

package org.LeetCodeExercise;

import java.util.HashSet;

public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board){
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++){
            int subboxrow = i/3;


            for (int j = 0; j<9; j++){
                char current_val = board[i][j];
                if (current_val != '.'){
                    int subboxcol = j/3;


                    if (!seen.add(current_val + " found in row "+ i)||
                         !seen.add(current_val + " found in column "+ j)||
                            !seen.add(current_val + " found in sub box "+ subboxrow + "-" + subboxcol))
                        return false;
                }
            }
        }
        return true;
    }
}

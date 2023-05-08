package org.LeetCodeExercise;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public List<String> generateParentheses(int n){
        List<String> output_arr = new ArrayList();
        backtrack(output_arr,"", 0,0,n);
        return output_arr;
    }
    public void backtrack(List<String> output_arr,String current_string, int open, int close, int max  ){
        if (current_string.length() == max * 2){ // some best case
            output_arr.add(current_string);
            return;
        }
        if (open < max) backtrack(output_arr, current_string + "(", open + 1, close, max);
        if (close < open) backtrack(output_arr, current_string + ")", open, close + 1, max);

    }




}

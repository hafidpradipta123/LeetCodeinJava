package org.LeetCodeExercise.Stack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesesStack22 {
        public static void main(String[] args){
            GenerateParenthesesStack22 sol = new GenerateParenthesesStack22();
            sol.generateParenthesis(3);
        }

        Stack<Character> stack = new Stack<>();
        List<String> res = new ArrayList<>();

        public List<String> generateParenthesis( int n){
            backtrack(0,0,n);
            return res;
        }

        private void backtrack(int openN, int closedN, int n){
            if (openN == closedN && closedN == n){
                Iterator vale = stack.iterator();
                String temp = "";
                while(vale.hasNext()){
                    temp = temp + vale.next();
                }
                res.add(temp);
            }

            if (openN < n){
                stack.push('(');
                backtrack(openN+1, closedN, n);
                stack.pop();
            }
            if (closedN < openN){
                stack.push(')');
                backtrack(openN, closedN + 1, n);
                stack.pop();
            }
        }



}

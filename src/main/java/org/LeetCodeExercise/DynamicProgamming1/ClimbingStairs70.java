package org.LeetCodeExercise.DynamicProgamming1;

public class ClimbingStairs70 {
    public int climbStairs(int n){
        int a = 1;
        int b = 1;
        int c;

        for (int i = 0; i < n -1; i++){
            c = a + b;
            a = b;
            b = c;

        }
        return b;
    }
}

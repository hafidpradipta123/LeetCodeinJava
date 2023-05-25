package org.LeetCodeExercise.Stack;

import java.util.Stack;

public class MinStack155 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack155(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push (int val){
        stack.push(val);

        val = Math.min(val, minStack.isEmpty() ? val:minStack.peek());
        minStack.push(val);
    }

    public void pop(){
        stack.pop();
        minStack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}

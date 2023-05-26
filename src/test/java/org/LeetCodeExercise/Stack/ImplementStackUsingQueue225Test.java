package org.LeetCodeExercise.Stack;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStackUsingQueue225Test {
    private ImplementStackUsingQueue225 stack;
    @BeforeEach
    public void setUp() {
        stack = new ImplementStackUsingQueue225();
    }

    @Test
    public void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3, stack.pop());
        Assert.assertEquals(2, stack.pop());
        Assert.assertEquals(1, stack.pop());
    }

    @Test
    public void testTop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3, stack.top());
        Assert.assertEquals(3, stack.top());
    }

    @Test
    public void testEmpty() {
        Assert.assertTrue(stack.empty());

        stack.push(1);
        Assert.assertFalse(stack.empty());

        stack.pop();
        Assert.assertTrue(stack.empty());
    }
}
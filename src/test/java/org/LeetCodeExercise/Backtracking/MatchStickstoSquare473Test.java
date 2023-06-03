package org.LeetCodeExercise.Backtracking;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchStickstoSquare473Test {
    @Test
    public void testMakesquare_ValidMatchsticks_ReturnsTrue() {
        MatchStickstoSquare473 matcher = new MatchStickstoSquare473();
        int[] matchsticks = {1, 1, 2, 2, 2};
        boolean result = matcher.makesquare(matchsticks);
        Assert.assertTrue(result);
    }

    @Test
    public void testMakesquare_InvalidMatchsticks_ReturnsFalse() {
        MatchStickstoSquare473 matcher = new MatchStickstoSquare473();
        int[] matchsticks = {3, 3, 3, 3, 4};
        boolean result = matcher.makesquare(matchsticks);
        Assert.assertFalse(result);
    }

    @Test
    public void testMakesquare_EmptyMatchsticks_ReturnsFalse() {
        MatchStickstoSquare473 matcher = new MatchStickstoSquare473();
        int[] matchsticks = {};
        boolean result = matcher.makesquare(matchsticks);
        Assert.assertFalse(result);
    }
}
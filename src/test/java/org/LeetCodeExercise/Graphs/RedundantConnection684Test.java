package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedundantConnection684Test {
    @Test
    public void testFindRedundantConnection() {
        RedundantConnection684 solution = new RedundantConnection684();

        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        int[] expected = {2, 3};
        int[] actual = solution.findRedundantConenction(edges);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFind() {
        RedundantConnection684 solution = new RedundantConnection684();

        solution.parent = new int[]{1, 2, 2, 4};
        int expected = 2;
        int actual = solution.find(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnion() {
        RedundantConnection684 solution = new RedundantConnection684();

        solution.parent = new int[]{1, 2, 2, 4};
        solution.union(3, 4);
        int expected = 2;
        int actual = solution.find(4);
        Assertions.assertEquals(expected, actual);
    }

}
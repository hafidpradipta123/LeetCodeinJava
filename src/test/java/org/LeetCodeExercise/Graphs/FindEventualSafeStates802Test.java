package org.LeetCodeExercise.Graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindEventualSafeStates802Test {

    @Test
    public void eventualSafeNodes_ExampleGraph_ReturnsExpectedResult() {
        // Arrange
        int[][] graph = {
                {1, 2},     // Node 0
                {2, 3},     // Node 1
                {3},        // Node 2
                {},         // Node 3
        };

        FindEventualSafeStates802 solution = new FindEventualSafeStates802();

        // Act
        List<Integer> result = solution.eventualSafeNodes(graph);

        // Assert
        List<Integer> expected = Arrays.asList(3);
        Assert.assertEquals(expected, result);
    }

}
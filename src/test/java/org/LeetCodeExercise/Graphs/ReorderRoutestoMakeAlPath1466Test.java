package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReorderRoutestoMakeAlPath1466Test {
    @Test
    void testMinReorder() {
        // Test input data
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};

        // Expected output
        int expectedChanges = 3;

        // Create adjacency list
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            al.add(new ArrayList<>());
        for (var c : connections) {
            al.get(c[0]).add(c[1]);
            al.get(c[1]).add(-c[0]);
        }

        // Call the method under test
        int actualChanges = minReorder(n, connections);

        // Assertion
        Assertions.assertEquals(expectedChanges, actualChanges);
    }

    private int minReorder(int n, int[][] connections) {
        int change = 0;
        boolean[] visited = new boolean[n];
        List<List<Integer>> al = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            al.add(new ArrayList<>());
        for (var c : connections) {
            al.get(c[0]).add(c[1]);
            al.get(c[1]).add(-c[0]);
        }
        return dfs(al, visited, 0);
    }

    private int dfs(List<List<Integer>> al, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        for (var to : al.get(from))
            if (!visited[Math.abs(to)])
                change += dfs(al, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
        return change;
    }

}
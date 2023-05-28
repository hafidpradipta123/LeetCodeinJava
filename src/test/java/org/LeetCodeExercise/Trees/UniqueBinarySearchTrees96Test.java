package org.LeetCodeExercise.Trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueBinarySearchTrees96Test {

    @Test
    void numTrees() {

        UniqueBinarySearchTrees96 uniqueBST = new UniqueBinarySearchTrees96();

        // Test case 1: n = 3
        int n1 = 3;
        int expected1 = 5;
        int result1 = uniqueBST.numTrees(n1);
        assertEquals(expected1, result1);

        // Test case 2: n = 5
        int n2 = 5;
        int expected2 = 42;
        int result2 = uniqueBST.numTrees(n2);
        assertEquals(expected2, result2);

        // Test case 3: n = 0
        int n3 = 0;
        int expected3 = 1;
        int result3 = uniqueBST.numTrees(n3);
        assertEquals(expected3, result3);
    }
}
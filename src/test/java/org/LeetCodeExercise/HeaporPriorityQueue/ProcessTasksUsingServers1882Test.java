package org.LeetCodeExercise.HeaporPriorityQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTasksUsingServers1882Test {

    @Test
    void assignTasks() {
        ProcessTasksUsingServers1882 solution = new ProcessTasksUsingServers1882();

        // Example test case
        int[] servers = {3,3,2};
        int[] tasks = {1,2,3,2,1,2};
        int[] expected = {2,2,0,2,1,2};

        int[] result = solution.assignTasks(servers, tasks);

        assertArrayEquals(expected, result, "Output doesn't match the expected result.");

        // Additional test case
        int[] servers2 = {5, 3, 1};
        int[] tasks2 = {4, 3, 2, 1};
        int[] expected2 = {2, 1, 0, 1};

        int[] result2 = solution.assignTasks(servers2, tasks2);

        assertArrayEquals(expected2, result2, "Output doesn't match the expected result.");
    }
}
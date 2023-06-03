package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIV1462Test {

    @Test
    void testCheckIfPrerequisite() {
        CourseScheduleIV1462 courseSchedule = new CourseScheduleIV1462();

        int n = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[][] queries = {{0, 1}, {1, 3}, {2, 3}, {2, 0}};

        List<Boolean> expected = Arrays.asList(true, true, true, false);
        List<Boolean> actual = courseSchedule.checkIfPrerequisite(n, prerequisites, queries);

        assertEquals(expected, actual);
    }

}
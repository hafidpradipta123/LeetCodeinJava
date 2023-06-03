package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseSchedule207Test {
    @Test
    public void testCanFinish() {
        CourseSchedule207 courseSchedule = new CourseSchedule207();

        // Test case 1: No prerequisites, should return true
        int numCourses1 = 3;
        int[][] prerequisites1 = {};
        assertTrue(courseSchedule.canFinish(numCourses1, prerequisites1));

        // Test case 2: Valid prerequisites, should return true
        int numCourses2 = 4;
        int[][] prerequisites2 = {{1, 0}, {2, 1}, {3, 2}};
        assertTrue(courseSchedule.canFinish(numCourses2, prerequisites2));

        // Test case 3: Invalid prerequisites, should return false
        int numCourses3 = 3;
        int[][] prerequisites3 = {{0, 1}, {1, 0}};
        assertFalse(courseSchedule.canFinish(numCourses3, prerequisites3));

        // Test case 4: Multiple prerequisites, should return true
        int numCourses4 = 5;
        int[][] prerequisites4 = {{1, 0}, {2, 1}, {3, 2}, {4, 3}, {1, 4}};
        assertTrue(courseSchedule.canFinish(numCourses4, prerequisites4));
    }

}
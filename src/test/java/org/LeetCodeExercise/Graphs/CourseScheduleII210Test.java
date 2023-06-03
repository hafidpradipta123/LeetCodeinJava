package org.LeetCodeExercise.Graphs;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleII210Test {

    @Test
    public void testFindOrder() {
        CourseScheduleII210 courseSchedule = new CourseScheduleII210();

        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] expectedOrder = {0, 1, 2, 3};

        int[] result = courseSchedule.findOrder(numCourses, prerequisites);

        Assert.assertArrayEquals(expectedOrder, result);
    }

}
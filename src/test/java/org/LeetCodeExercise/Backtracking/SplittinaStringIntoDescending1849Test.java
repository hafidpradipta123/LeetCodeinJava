package org.LeetCodeExercise.Backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplittinaStringIntoDescending1849Test {


    @Test
    void splitString_ValidString_ReturnsTrue() {
        SplittinaStringIntoDescending1849 splitter = new SplittinaStringIntoDescending1849();
        assertTrue(splitter.splitString("543210"));
    }

    @Test
    void splitString_InvalidString_ReturnsFalse() {
        SplittinaStringIntoDescending1849 splitter = new SplittinaStringIntoDescending1849();
        assertFalse(splitter.splitString("123456789"));
    }

    @Test
    void splitString_NullString_ReturnsFalse() {
        SplittinaStringIntoDescending1849 splitter = new SplittinaStringIntoDescending1849();
        assertFalse(splitter.splitString(null));
    }

    @Test
    void splitString_ShortString_ReturnsFalse() {
        SplittinaStringIntoDescending1849 splitter = new SplittinaStringIntoDescending1849();
        assertFalse(splitter.splitString("1"));
    }

}
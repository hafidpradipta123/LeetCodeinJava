package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.IsomorphicStrings205;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStrings205Test {

    @Test
    void isIsomorphic() {
        IsomorphicStrings205 formula = new IsomorphicStrings205();
        String s = "egg";
        String t = "add";
        boolean result = formula.isIsomorphic(s,t);
        assertTrue(result);
    }
}
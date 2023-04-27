package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackSpaceStringCompare844Test {

    @Test
    void backspaceCompare() {

        BackSpaceStringCompare844 bs = new BackSpaceStringCompare844();

        String S = "ab#c";
        String T = "ad#c";
        assertTrue(bs.backspaceCompare(S, T));

    }

}
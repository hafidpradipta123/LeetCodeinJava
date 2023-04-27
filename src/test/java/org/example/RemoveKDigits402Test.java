package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveKDigits402Test {

    @Test
    void removeKdigits() {
        String num = "1432219";
        int k = 3;
        String expected = "1219";

        RemoveKDigits402 remove = new RemoveKDigits402();
        String result = remove.removeKdigits(num, k);
        assertEquals(expected, result);

    }
}
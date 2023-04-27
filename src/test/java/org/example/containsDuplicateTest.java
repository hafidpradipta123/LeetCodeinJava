package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class containsDuplicateTest {

    @Test
    void containsDuplicate1() {
        int[] samplenum = {1, 3, 4, 5, 6,7,8,9,1};
        containsDuplicate217 cd1 = new containsDuplicate217();
        assertFalse(cd1.containsDuplicate1(samplenum));
    }

    @Test
    void containsDuplicate2() {
        int[] samplenum = {1, 3, 4, 5, 6};
        containsDuplicate217 cd1 = new containsDuplicate217();
        assertFalse(cd1.containsDuplicate2(samplenum));
    }
}
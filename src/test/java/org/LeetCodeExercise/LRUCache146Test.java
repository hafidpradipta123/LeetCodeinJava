package org.LeetCodeExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCache146Test {
    @Test
    void testLRUCache() {
        LRUCache146 cache = new LRUCache146(2);

        cache.put(1, 1);
        cache.put(2, 2);
        Assertions.assertEquals(1, cache.get(1)); // returns 1
        cache.put(3, 3);
        Assertions.assertEquals(-1, cache.get(2)); // returns -1 (not found)
        cache.put(4, 4);
        Assertions.assertEquals(-1, cache.get(1)); // returns -1 (not found)
        Assertions.assertEquals(3, cache.get(3)); // returns 3
        Assertions.assertEquals(4, cache.get(4)); // returns 4
    }
    @Test
    void get() {
    }

    @Test
    void put() {
    }

    @Test
    void add() {
    }

    @Test
    void remove() {
    }
}
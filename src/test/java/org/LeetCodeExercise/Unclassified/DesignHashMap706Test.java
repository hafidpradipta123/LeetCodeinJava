package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.DesignHashMap706;
import org.LeetCodeExercise.Unclassified.ListNodeHM;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DesignHashMap706Test {

//    private DesignHashMap706 hashMap;
//
//    @Before
//    public void setUp() {
//        hashMap = new DesignHashMap706();
//    }

    @Test
    public void testPutAndGet() {
        DesignHashMap706 hashMap = new DesignHashMap706();
        hashMap.put(1, 1);
        hashMap.put(2, 2);

        assertEquals(1, hashMap.get(1));
        assertEquals(2, hashMap.get(2));
        assertEquals(-1, hashMap.get(3));
    }


    @Test
    public void testnext() {
        DesignHashMap706 hashMap = new DesignHashMap706();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 3);
        hashMap.put(4, 4);
        hashMap.put(7, 7);
        hashMap.put(10, 10);
        hashMap.remove(1);


        assertEquals(7, hashMap.get(7));
        assertEquals(10, hashMap.get(10));
    }

    @Test
    public void testRemove() {
        DesignHashMap706 hashMap = new DesignHashMap706();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.remove(2);

        assertEquals(1, hashMap.get(1));
        assertEquals(-1, hashMap.get(2));
    }

    @Test
    public void testMultipleOperations() {
        DesignHashMap706 hashMap = new DesignHashMap706();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        assertEquals(1, hashMap.get(1));
        assertEquals(-1, hashMap.get(3));
        hashMap.put(2, 1);
        assertEquals(1, hashMap.get(2));
        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));
        hashMap.put(2, 3);
        hashMap.put(3, 3);
        hashMap.put(2, 5);
        hashMap.put(2, 6);

    }


        @Test
        public void testNext() {
            // Create three nodes
            ListNodeHM node1 = new ListNodeHM(1, 10, null);
            ListNodeHM node2 = new ListNodeHM(2, 20, null);
            ListNodeHM node3 = new ListNodeHM(3, 30, null);

            // Link the nodes
            node1.next = node2;
            node2.next = node3;

            // Test the next field values
            assertEquals(node2, node1.next);
            assertEquals(node3, node2.next);
            assertNull(node3.next);

    }
}
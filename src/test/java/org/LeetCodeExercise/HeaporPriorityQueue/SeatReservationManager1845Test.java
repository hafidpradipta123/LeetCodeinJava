package org.LeetCodeExercise.HeaporPriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatReservationManager1845Test {

    private SeatReservationManager1845 seatManager;

    @BeforeEach
    public void setUp() {
        seatManager = new SeatReservationManager1845(5);
    }

    @Test
    public void testReserve() {
        assertEquals(1, seatManager.reserve());
        assertEquals(2, seatManager.reserve());
        assertEquals(3, seatManager.reserve());
        assertEquals(4, seatManager.reserve());
        assertEquals(5, seatManager.reserve());
    }

    @Test
    public void testUnreserve() {
        seatManager.reserve();
        seatManager.reserve();
        seatManager.reserve();

        seatManager.unreserve(2);
        seatManager.unreserve(4);

        assertEquals(2, seatManager.reserve());
        assertEquals(4, seatManager.reserve());
    }
}
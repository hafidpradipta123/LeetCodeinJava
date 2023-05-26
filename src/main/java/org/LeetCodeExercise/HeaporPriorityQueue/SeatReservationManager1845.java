package org.LeetCodeExercise.HeaporPriorityQueue;

import java.util.PriorityQueue;

public class SeatReservationManager1845 {
    PriorityQueue<Integer> pq;
    int count;
    public SeatReservationManager1845(int n){ // This is a constructor take a look at your OOP courses
        count = 1;
        pq = new PriorityQueue<>();

    }

    public int reserve(){
        if (pq.size() == 0)
            return count++;

        return pq.poll();
    }

    public void unreserve(int seatNumber){
        pq.add(seatNumber);
    }
}
/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
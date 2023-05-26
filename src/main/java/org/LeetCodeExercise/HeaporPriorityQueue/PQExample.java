package org.LeetCodeExercise.HeaporPriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;


public class PQExample {

        public static void main(String[] args) {
            // Creating a priority queue with natural ordering
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

           // {2,7,4,1,8,1,9,15,16,20,23,22}

            // Adding elements to the priority queue
            priorityQueue.add(2);
            priorityQueue.add(7);
            priorityQueue.add(4);
            priorityQueue.add(1);
            priorityQueue.add(8);
            priorityQueue.add(1);
            priorityQueue.add(2);
            priorityQueue.add(4);
            priorityQueue.add(5);
            priorityQueue.add(7);
            priorityQueue.add(3);
            priorityQueue.add(15);
            priorityQueue.add(16);
            priorityQueue.add(20);
            priorityQueue.add(23);
            priorityQueue.add(22);
            priorityQueue.add(1);
            priorityQueue.add(2);
            priorityQueue.add(4);
            priorityQueue.add(5);



            // Printing the elements in the priority queue
            System.out.println("Priority Queue elements (natural ordering): " + priorityQueue);

            // Removing the element with the lowest value
            int minValue = priorityQueue.poll();
            System.out.println("Removed element with lowest value: " + minValue);

            // Printing the elements in the priority queue after removal
            System.out.println("Priority Queue elements after removal: " + priorityQueue);

            // Creating a priority queue with a custom comparator for reverse ordering
            PriorityQueue<Integer> reversePriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

            // Adding elements to the reverse priority queue
            reversePriorityQueue.add(5);
            reversePriorityQueue.add(2);
            reversePriorityQueue.add(8);
            reversePriorityQueue.add(1);

            // Printing the elements in the reverse priority queue
            System.out.println("Reverse Priority Queue elements: " + reversePriorityQueue);
        }
    }



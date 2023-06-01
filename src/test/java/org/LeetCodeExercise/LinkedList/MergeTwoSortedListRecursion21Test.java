package org.LeetCodeExercise.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListRecursion21Test {

    @Test
    void mergeTwoLists() {

        // Create two sorted linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Create an instance of MergeTwoSortedListRecursion21
        MergeTwoSortedListRecursion21 merger = new MergeTwoSortedListRecursion21();

        // Merge the two lists
        ListNode mergedList = merger.mergeTwoLists(list1, list2);

        // Create an array to store the expected values of the merged list
        int[] expectedValues = {1,2,3,4,5,6};

        // Iterate through the merged list and compare its values with the expected values
        int index = 0;
        while (mergedList != null) {
            assertEquals(expectedValues[index], mergedList.val);
            mergedList = mergedList.next;
            index++;
        }
    }
}
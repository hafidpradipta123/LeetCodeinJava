package org.LeetCodeExercise.Graphs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountsMerge721Test {

    @Test
    public void testAccountsMerge() {
        AccountsMerge721 merge = new AccountsMerge721();

        List<List<String>> accounts = new ArrayList<>();
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"));
        accounts.add(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"));
        accounts.add(Arrays.asList("Mary", "mary@mail.com"));
        accounts.add(Arrays.asList("John", "johnnybravo@mail.com"));

        List<List<String>> mergedAccounts = merge.accountsMerge(accounts);

        // Check the size of the merged accounts list
        assertEquals(3, mergedAccounts.size());

        // Check the first merged account
        List<String> firstMergedAccount = mergedAccounts.get(0);
        assertEquals(4, firstMergedAccount.size());
        assertEquals("John", firstMergedAccount.get(0));
        assertTrue(firstMergedAccount.contains("johnsmith@mail.com"));
        assertTrue(firstMergedAccount.contains("john_newyork@mail.com"));
        assertTrue(firstMergedAccount.contains("john00@mail.com"));

        // Check the second merged account
        List<String> secondMergedAccount = mergedAccounts.get(1);
        assertEquals(2, secondMergedAccount.size());
        assertEquals("Mary", secondMergedAccount.get(0));
        assertEquals("mary@mail.com", secondMergedAccount.get(1));

        // Check the third merged account
        List<String> thirdMergedAccount = mergedAccounts.get(2);
        assertEquals(2, thirdMergedAccount.size());
        assertEquals("John", thirdMergedAccount.get(0));
        assertEquals("johnnybravo@mail.com", thirdMergedAccount.get(1));
    }
}
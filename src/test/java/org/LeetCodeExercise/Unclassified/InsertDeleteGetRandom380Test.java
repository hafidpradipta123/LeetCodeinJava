package org.LeetCodeExercise.Unclassified;

import org.LeetCodeExercise.Unclassified.InsertDeleteGetRandom380;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class InsertDeleteGetRandom380Test {
    private InsertDeleteGetRandom380 randomizedSet;

    @BeforeEach
    public void setUp() {
        randomizedSet = new InsertDeleteGetRandom380();
    }

    @Test
    public void testInsert() {
        boolean result = randomizedSet.insert(1);
        Assertions.assertTrue(result, "Insertion of 1 should return true");


    }

    @Test
    public void testInsertDuplicate() {
        randomizedSet.insert(1);
        boolean result = randomizedSet.insert(1);
        Assertions.assertFalse(result, "Insertion of duplicate value should return false");
    }

    @Test
    public void testRemove() {
        randomizedSet.insert(1);
        boolean result = randomizedSet.remove(1);
        Assertions.assertTrue(result, "Removal of existing value should return true");
    }

    @Test
    public void testRemoveNonExisting() {
        boolean result = randomizedSet.remove(2);
        Assertions.assertFalse(result, "Removal of non-existing value should return false");
    }

    @Test
    public void testGetRandom() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);

        int randomValue = randomizedSet.getRandom();
        Assertions.assertTrue(randomValue == 1 || randomValue == 2, "Random value should be 1 or 2");
    }

    @Test
    public void altogether() {
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        randomizedSet.insert(3);
        randomizedSet.insert(4);
        randomizedSet.insert(5);
        randomizedSet.insert(6);


        boolean resultdup = randomizedSet.insert(1);
        Assertions.assertFalse(resultdup, "Insertion of duplicate value should return false");

        boolean result = randomizedSet.remove(4);
        Assertions.assertTrue(result, "Removal of existing value should return true");

        boolean resultNE = randomizedSet.remove(9);
        Assertions.assertFalse(resultNE, "Removal of non-existing value should return false");

        int randomValue = randomizedSet.getRandom();
        Assertions.assertTrue(randomValue == 1 || randomValue == 2 || randomValue == 3
                        || randomValue == 5 || randomValue == 6
                );
            }

}
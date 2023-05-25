package org.LeetCodeExercise.Unclassified;

import java.sql.Array;
import java.util.*;

public class InsertDeleteGetRandom380 {

    private Map<Integer, Integer> indexing; // field variable
    private List<Integer> numbers;

    public InsertDeleteGetRandom380(){
        this.indexing = new HashMap<>();
        this.numbers = new ArrayList<>();

    }

    public boolean insert(int val){
        if (this.indexing.containsKey(val)){
            return false;
        }
        int indexInsert = this.numbers.size();
        this.numbers.add(val);
        this.indexing.put(val, indexInsert);
        return true;
    }
    public boolean remove(int val){
        if (!this.indexing.containsKey(val)){
            return false;
        }

        int lastIndex = this.numbers.size() -1;
        int lastElement = this.numbers.get(lastIndex);
        int indexElement = this.indexing.get(val);

        //Swap the lat element
        this.numbers.set(indexElement, lastElement);

        // Update indies[ add & Delete]
        this.indexing.put(lastElement, indexElement);
        this.indexing.remove(val);

        // Remove from list
        this.numbers.remove(lastIndex);
        return true;

    }

    public int getRandom(){
        int randomIndex = (int) (Math.random() * this.numbers.size());
        return this.numbers.get(randomIndex);
    }







}

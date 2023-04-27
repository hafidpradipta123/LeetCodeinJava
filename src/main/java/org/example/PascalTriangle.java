package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>(); // list of a list that is consist of arraylist
        if (numRows == 0) return triangle;// do this check

        List<Integer> first_row = new ArrayList<>(); // now we have list of integer
        first_row.add(1);
        triangle.add(first_row);


        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < 1; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            row.add(1);
            triangle.add(row);


        }
        return triangle;


    }
}

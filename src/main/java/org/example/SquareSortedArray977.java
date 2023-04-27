package org.example;

public class SquareSortedArray977 {
    public int[] sortedSquares(int[]A){
        int N = A.length;
        int positive_pointer = 0;
        while (positive_pointer <N && A[positive_pointer] <0){
            positive_pointer +=1;
        }
        int negative_pointer = positive_pointer-1; // set the index to the first negative element
        int[] sorted_squares = new int [N];
        int counter = 0;

        while(negative_pointer >= 0 && positive_pointer <N){
            if (A[negative_pointer] * A[negative_pointer] < A[positive_pointer] * A[positive_pointer]){
                sorted_squares[counter] = A[negative_pointer] * A[negative_pointer];
                negative_pointer -=1;
            } else{
                sorted_squares[counter]= A[positive_pointer] * A[positive_pointer];
                positive_pointer +=1;
            }
            counter +=1;
        }
        while(negative_pointer >= 0){
            sorted_squares[counter] = A[negative_pointer] *A[negative_pointer];
            negative_pointer -=1;
            counter += 1;

        }
        while(positive_pointer < N) {
            sorted_squares[counter] = A[positive_pointer] * A[positive_pointer];
            positive_pointer += 1;
            counter += 1;
        }
        return sorted_squares;

    }
}

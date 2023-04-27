package org.example;

public class TransposeMatrix867 {
    public int [][] transpose(int [][] A){
        int rows = A.length;
        int cols = A[0].length;

        int [][] new_matrix = new int[cols][rows];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                new_matrix[j][i] = A[i][j];
            }
        }
        return new_matrix;
    }
}

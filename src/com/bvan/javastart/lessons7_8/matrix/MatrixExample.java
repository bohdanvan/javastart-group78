package com.bvan.javastart.lessons7_8.matrix;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };

        int elem = matrix[2][2];
        System.out.println(elem);

        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    private static void printArray(int[] array) {
        for (int e : array) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}

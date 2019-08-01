package com.sourceit.kopiichenko.l2;

public class PascalsTriangleArray {
    //Create a triangular array of 10 strings and fill it in with binomial coefficients (Pascal's triangle)

    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        int[][] pascalTriangle = new int[ARRAY_SIZE][];
        System.out.println("Pascal's triangle");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = pascalTriangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        for (int k = 0; k < ARRAY_SIZE; k++) {
            for (int m = 0; m <= k; m++) {
                System.out.format(pascalTriangle[k][m] + " ");
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}

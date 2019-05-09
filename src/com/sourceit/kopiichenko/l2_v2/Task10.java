package com.sourceit.kopiichenko.l2_v2;

public class Task10 {
    //Create a triangular array of 10 strings and fill it in with binomial coefficients (Pascal's triangle)
    private static final int STRINGS = 10;

    public static void main(String[] args) {
        System.out.println("Pascal's triangle");
            int[][] array = new int[STRINGS][STRINGS];
            for (int i = 0; i < STRINGS; i++) {
                array[i][0] = array[i][i] = 1;
                for (int j = 1; j < i; j++) {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
            for (int n = 0; n < STRINGS; n++) {
                for (int k = 0; k <= n; k++) {
                    System.out.format(array[n][k] + " ");
                    System.out.print(" ");
                }
                System.out.println();

            }
        }
    }

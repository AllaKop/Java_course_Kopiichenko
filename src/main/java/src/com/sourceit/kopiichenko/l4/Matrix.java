package com.sourceit.kopiichenko.l4;

import java.util.Arrays;

import static java.lang.Math.random;


public class Matrix {

    static double[][] matrix1;
    static int matrix1Size;
    static int elementsRangeForMatrix1;
    static double[][] matrix2;
    static int matrix2Size;
    static int elementsRangeForMatrix2;
    static int number;
    static double temp;

    /**
     * Creating new matrix and filling it with the random values using method Math.random.
     * and increasing range of values from (0;1) to (0; n).
     * Displaying values of the first matrix.
     */

    public void fillTheMatrix1() {
        matrix1 = new double[matrix1Size][matrix1Size];
        for ( int i = 0; i < matrix1.length; i++ ) {
            for ( int j = 0; j < matrix1[i].length; j++ ) {
                matrix1[i][j] = random() * elementsRangeForMatrix1;
            }
        }
        System.out.println("Matrix 1");
        System.out.println(Arrays.deepToString(matrix1));
    }

    /**
     * Creating second matrix and filling it with the random values using method Math.random.
     * and increasing range of values from (0;1) to (0; n).
     * Displaying values of the second matrix.
     */

    public void fillTheMatrix2() {
        matrix2 = new double[matrix2Size][matrix2Size];
        for ( int i = 0; i < matrix2.length; i++ ) {
            for ( int j = 0; j < matrix2[i].length; j++ ) {
                matrix2[i][j] = random() * elementsRangeForMatrix2;
            }
        }
        System.out.println("Matrix 2");
        System.out.println(Arrays.deepToString(matrix2));
    }

    /**
     * Sums up two matrices.
     * Checking if the matrices are equal.
     * Assign the first matrix the result of summing up.
     * Displaying the first matrix.
     *
     * @throws IllegalArgumentException if the matrices have different sizes.
     */

    public void sum() {
        if (matrix1Size == matrix2Size) {
            for ( int i = 0; i < matrix1.length; i++ ) {
                for ( int j = 0; j < matrix1[i].length; j++ ) {
                    matrix1[i][j] += matrix2[i][j];
                }
            }
            System.out.println("Matrix 1 combined with Matrix 2");
            System.out.println(Arrays.deepToString(matrix1));
        } else {
            throw new IllegalArgumentException("Please check sizes of your matrices");
        }
    }

    /**
     * Multiplying values of the first matrix by number.
     * Displaying the first matrix.
     */

    public void matrixTimesNumber() {
        for ( int i = 0; i < matrix1.length; i++ ) {
            for ( int j = 0; j < matrix1[i].length; j++ ) {
                matrix1[i][j] *= number;
            }
        }
        System.out.println("Matrix 1 times number" + number);
        System.out.println(Arrays.deepToString(matrix1));
    }

    /**
     * Multiplying values of the first matrix by values of the second one.
     * Assign the first matrix the result of multiplying.
     * Displaying the first matrix.
     */

    public void matrix1TimesMatrix2() {
        for ( int i = 0; i < matrix1.length; i++ ) {
            for ( int j = 0; j < matrix1[i].length; j++ ) {
                matrix1[i][j] *= matrix2[i][j];
            }
        }
        System.out.println("Matrix 1 times Matrix 2");
        System.out.println(Arrays.deepToString(matrix1));
    }

    /**
     * Transposing the first matrix.
     * Displaying the first matrix.
     */

    public void matrixTransposition() {
        for ( int i = 0; i < matrix1.length; i++ ) {
            for ( int j = i + 1; j < matrix1[i].length; j++ ) {
                temp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i] = temp;
            }
        }
        System.out.println("Transposed Matrix 1");
        System.out.println(Arrays.deepToString(matrix1));
    }
}
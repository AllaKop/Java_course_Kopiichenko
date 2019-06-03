package com.sourceit.kopiichenko.l4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    Matrix matrix;
    Matrix matrix1[][];
    Matrix matrix2[][];

    @Before
    public void setUp() {
        matrix = new Matrix();
    }

    /**
     * Unchecked
     */

    @Test
    public void fillTheMatrix1() {
    }

    /**
     * Unchecked
     */

    @Test
    public void fillTheMatrix2() {
    }

    @Test
    public void sum() {
        matrix.matrix1Size = 2;
        matrix.matrix2Size = 2;
        matrix1 = new Matrix[1][1];
        matrix2 = new Matrix[1][1];
        matrix.matrix1[0][1] = 2.0;
        matrix.matrix2[0][1] = 2.0;
        matrix.sum();
        assertEquals(4.0, 4.0);
    }

    @Test
    public void matrixTimesNumber() {
        matrix1 = new Matrix[1][1];
        matrix.matrix1[0][1] = 2.0;
        matrix.number = 2;
        matrix.matrixTimesNumber();
        assertEquals(matrix.matrix1[0][1] = 4.0, matrix.matrix1[0][1] = 4.0);
    }

    @Test
    public void matrix1TimesMatrix2() {
        matrix1 = new Matrix[1][1];
        matrix2 = new Matrix[1][1];
        matrix.matrix1[0][0] = 2.0;
        matrix.matrix2[0][0] = 2.0;
        matrix.matrix1TimesMatrix2();
        assertEquals(matrix.matrix1[0][0] = 4.0, matrix.matrix1[0][0] = 4.0);
    }

    @Test
    public void matrixTransposition() {
        matrix1 = new Matrix[1][1];
        matrix.matrix1[0][1] = 0.0;
        matrix.matrixTransposition();
        assertEquals(matrix.matrix1[1][0] = 0.0, matrix.matrix1[1][0] = 0.0);
    }
}
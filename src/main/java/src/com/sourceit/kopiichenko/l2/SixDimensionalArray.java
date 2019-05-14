package com.sourceit.kopiichenko.l2;

public class SixDimensionalArray {
/* Create a six-dimensional array with two values in each dimension.
Fill in the array with numbers from the beginning of the natural series.
How many numbers are needed?
 */

    private static final int[][][][][][] SIX_DIMENSIONAL_ARRAY = new int[2][2][2][2][2][2];

    public static void main(String[] args) {
        int number = 1;
        for (int i = 0; i < SIX_DIMENSIONAL_ARRAY.length; i++) {
            for (int j = 0; j < SIX_DIMENSIONAL_ARRAY[i].length; j++) {
                for (int k = 0; k < SIX_DIMENSIONAL_ARRAY[j].length; k++) {
                    for (int l = 0; l < SIX_DIMENSIONAL_ARRAY[k].length; l++) {
                        for (int m = 0; m < SIX_DIMENSIONAL_ARRAY[l].length; m++) {
                            for (int n = 0; n < SIX_DIMENSIONAL_ARRAY[m].length; n++) {
                                SIX_DIMENSIONAL_ARRAY[i][j][k][l][m][n] += number;
                                number++;
                                System.out.println(SIX_DIMENSIONAL_ARRAY[i][j][k][l][m][n]);
                            }
                        }
                    }
                }
            }
        }
    }
}
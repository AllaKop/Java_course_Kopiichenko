package com.sourceit.kopiichenko.l2;

public class SixDimensionalArray {
/* Create a six-dimensional array with two values in each dimension.
Fill in the array with numbers from the beginning of the natural series.
How many numbers are needed?
 */

    private static final int ARRAY_SIZE = 2;

    public static void main(String[] args) {
        int number = 1;
        int[][][][][][] sixDimensionalArray = new int[ARRAY_SIZE][ARRAY_SIZE][ARRAY_SIZE][ARRAY_SIZE][ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < sixDimensionalArray.length; i++) {
            for (int j = 0; j < sixDimensionalArray[i].length; j++) {
                for (int k = 0; k < sixDimensionalArray[j].length; k++) {
                    for (int m = 0; m < sixDimensionalArray[k].length; m++) {
                        for (int n = 0; n < sixDimensionalArray[m].length; n++) {
                            for (int p = 0; p < sixDimensionalArray[n].length; p++) {
                                sixDimensionalArray[i][j][k][m][n][p] += number++;
                                System.out.println(sixDimensionalArray[i][j][k][m][n][p]);
                            }
                        }
                    }
                }
            }
        }
    }
}
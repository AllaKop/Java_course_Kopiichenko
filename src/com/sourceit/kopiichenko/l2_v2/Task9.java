package com.sourceit.kopiichenko.l2_v2;

import java.util.Arrays;

public class Task9 {
/* Create a six-dimensional array with two values in each dimension.
Fill in the array with numbers from the beginning of the natural series.
How many numbers are needed?
 */

private static final int [][][][][][] SIXDIMARRAY = new int [2][2][2][2][2][2];

    public static void main(String[] args) {
        int number = 1;
        for (int i=0; i < SIXDIMARRAY.length; i++) {
            for (int j=0; j < SIXDIMARRAY[i].length; j++) {
                for (int k=0; k < SIXDIMARRAY[j].length; k++) {
                    for (int l=0; l < SIXDIMARRAY[k].length; l++) {
                        for (int m=0; m < SIXDIMARRAY[l].length; m++) {
                            for (int n=0; n < SIXDIMARRAY[m].length; n++) {
                                SIXDIMARRAY[i][j][k][l][m][n] += number;
                                number++;
                                System.out.println (SIXDIMARRAY[i][j][k][l][m][n]);
                            }
                        }
                    }
                }
            }
        }
    }
}
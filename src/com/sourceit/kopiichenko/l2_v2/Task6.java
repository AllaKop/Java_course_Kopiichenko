package com.sourceit.kopiichenko.l2_v2;

public class Task6 {
 //Place an array of 20 elements and fill it in with Fibonacci sequence.
 private static final int [] ARRAY = new int [20];

    public static void main(String[] args) {

        for (int i=0; i < ARRAY.length; i++) {
            if (i<2) {
                ARRAY [i] = 1;
            } else {
                ARRAY [i] = ARRAY [i-2]+ ARRAY [i-1];
            }
            System.out.println (ARRAY[i]);
        }
    }
}

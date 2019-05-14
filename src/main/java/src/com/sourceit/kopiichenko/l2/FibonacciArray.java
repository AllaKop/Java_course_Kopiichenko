package com.sourceit.kopiichenko.l2;

public class FibonacciArray {
    //Place an array of 20 elements and fill it in with Fibonacci sequence.
    private static final int[] FIBONACCI_ARRAY = new int[20];

    public static void main(String[] args) {

        for (int i = 0; i < FIBONACCI_ARRAY.length; i++) {
            if (i < 2) {
                FIBONACCI_ARRAY[i] = 1;
            } else {
                FIBONACCI_ARRAY[i] = FIBONACCI_ARRAY[i - 2] + FIBONACCI_ARRAY[i - 1];
            }
            System.out.println(FIBONACCI_ARRAY[i]);
        }
    }
}

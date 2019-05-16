package com.sourceit.kopiichenko.l2;

public class FibonacciArray {
    //Place an array of 20 elements and fill it in with Fibonacci sequence.

    private static final int ARRAY_SIZE = 20;

    public static void main(String[] args) {
        int[] fibonacciArray = new int[ARRAY_SIZE];
        for (int i = 0; i < fibonacciArray.length; i++) {
            if (i < 2) {
                fibonacciArray[i] = 1;
            } else {
                fibonacciArray[i] = fibonacciArray[i - 2] + fibonacciArray[i - 1];
            }
            System.out.println(fibonacciArray[i]);
        }
    }
}

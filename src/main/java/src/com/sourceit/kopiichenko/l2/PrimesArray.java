package com.sourceit.kopiichenko.l2;

import java.util.Arrays;

public class PrimesArray {
    //Create an array of 100 elements and fill it in with primes.
    private static boolean isPrime(int number, int[] primes, int last) {
        if (number > 0 && number < 3) {
            return true;
        }
        for (int i = 0; i < last; ++i) {

            if (number % primes[i] == 0) {
                return false;
            }
            int root = (int) Math.sqrt(number);
            if (primes[i] > root) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int ARRAY_SIZE = 100;
        int[] primes = new int[ARRAY_SIZE];
        int lastPrime = 2;
        for (int i = 0; i < primes.length; ++i) {
            primes[i] = lastPrime++;
            while (!isPrime(lastPrime, primes, i)) {
                lastPrime++;
            }
        }
        System.out.println(Arrays.toString(primes));
    }
}
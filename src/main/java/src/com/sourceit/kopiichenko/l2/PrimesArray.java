package com.sourceit.kopiichenko.l2;

import java.util.Arrays;

public class PrimesArray {
    //Create an array of 100 elements and fill it in with primes.
    private static boolean isPrime(int n, int[] primes, int last) {

        if (n < 3) {
            return true;
        }
        for (int i = 0; i < last; ++i) {

            if (n % primes[i] == 0) {
                return false;
            }
            int root = (int) Math.sqrt(n);
            if (primes[i] > root) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int[] primes = new int[100];
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
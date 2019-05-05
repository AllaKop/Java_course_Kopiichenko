package com.sourceit.kopiichenko.l2_v2;

import java.util.Arrays;
public class Task7 {
    //Создать целый массив из 100 элементов и заполнить его простыми числами: 2, 3, 5, 7, 11, 13, 17, …
    private static boolean isPrime(int n, int[] primes, int last) {

        if (n < 3) {
            return true;
        }
        int root = (int)Math.sqrt(n);
        for (int i = 0; i < last; ++i) {
            if (n % primes[i] == 0) {
                return false;
            }
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
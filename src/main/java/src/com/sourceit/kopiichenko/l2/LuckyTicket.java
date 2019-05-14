package com.sourceit.kopiichenko.l2;

public class LuckyTicket {
    // Calculate how many six-digit numbers have an equal sum of the first three and last three digits.

    private static final int MAX_NUMBER = 999999;

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= MAX_NUMBER; i++) {
            if (i / 100000 + (i / 10000) % 10 + (i / 1000) % 10 == (i / 100) % 10 + (i / 10) % 10 + i % 10) {
                sum++;
            }
        }
        System.out.println("The quantity of the six-digit numbers that have an equal sum of the first three and last three digits is " + sum);
    }
}

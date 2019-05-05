package com.sourceit.kopiichenko.l2_v2;

public class Task1 {
    // Написать программу, которая находит наибольший общий делитель двух целых положительных чисел.
    public static void main(String[] args) {

        System.out.println(gcd(25, 75));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int x = a % b;
        return gcd(b, x);

    }
}
package com.sourceit.kopiichenko.l2_v2;

public class Task3 {
    /* Написать программу проверки того, что заданное число Х – простое
    т.е. не делится без остатка ни на какие числа, кроме себя и 1).
     */
    public static void main (String [] args) {

        int b = 7;
        boolean t = true;
        int a;
        for (a = 2; a<b; a++) {
            if (b % a == 0) {
                t =false;
                break;
            }
        }
        if (t) System.out.println("число простое");
        else System.out.println("число составное");
    }
}

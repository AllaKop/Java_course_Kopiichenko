package com.sourceit.kopiichenko.l2;

import java.util.Scanner;

public class Factorial {
    //1!-2!+3!-4!+..+/-n!
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            long temp = 1;
            temp = -temp * i;
            result += temp;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum is " + factorial(n));
    }
}
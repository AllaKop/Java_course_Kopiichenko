package com.sourceit.kopiichenko.l2;

import java.util.Scanner;

public class GreatestCommonDivisor {
    // GCD of two positive integers
    public static void main(String[] args) {

        int i;
        int gcd = 1;
        System.out.println("Enter the two numbers");
        Scanner scan = new Scanner(System.in);
        int inputNumber1 = scan.nextInt();
        int inputNumber2 = scan.nextInt();
        if (inputNumber1 < 0 || inputNumber2 < 0) {
            throw new IllegalArgumentException("An error occurred");
        }
        if (inputNumber1 == 0 || inputNumber2 == 0) {
            System.out.println("The greatest common divisor is " + 1);
            return;
        } else
            for (i = 2; i <= Math.min(inputNumber1, inputNumber2); i++) {
                if (inputNumber1 % i == 0 && inputNumber2 % i == 0) {
                    gcd = i;
                }
            }
        System.out.println("The greatest common divisor is " + gcd);
    }
}
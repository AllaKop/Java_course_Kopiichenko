package com.sourceit.kopiichenko.l2;

import java.util.Scanner;

public class SumOfTheNumerals {
    // Create a program to find the sum of the numerals of a random number.
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        int numeralsSum = 0;
        while (inputNumber > 0) {
            numeralsSum += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("The sum of the numerals of your number is " + numeralsSum);
    }
}

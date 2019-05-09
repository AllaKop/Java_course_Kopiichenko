package com.sourceit.kopiichenko.l2_v2;

import java.util.Scanner;

public class Task2 {
    // Create a program to find the sum of the numerals of a random number.
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += + num % 10;
            num /= 10;
        }
        System.out.println("The sum of the numerals of your number is " + sum);
    }
}

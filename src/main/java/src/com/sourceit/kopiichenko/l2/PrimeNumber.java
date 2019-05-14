package com.sourceit.kopiichenko.l2;

import java.util.Scanner;

public class PrimeNumber {
    //Create a program to verify that the given number X is prime.
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        boolean isPrime = true;
        int root = (int) Math.sqrt(inputNumber);
        for (int divisor = 2; divisor < root; divisor++) {
            if (inputNumber % divisor != 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "prime number" : "number is not prime");
    }
}

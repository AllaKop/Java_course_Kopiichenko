package com.sourceit.kopiichenko.l2_v2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task3 {
    //Create a program to verify that the given number X is prime.
    public static void main (String [] args) {
        System.out.println("Please enter a number");
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        boolean isPrime = true;
        int a;
        int root = (int)Math.sqrt(n);
        for (a = 2; a<root; a++) {
            if (n % a != 0) {
                isPrime =false;
                break;
            }
        }
        System.out.println(isPrime? "prime number" : "number is not prime");
    }
}

package com.sourceit.kopiichenko.l2_v2;

import java.util.Scanner;

public class Task1 {
    // GCD of two positive integers
    public static void main(String[] args) {

        int i;
        int gcd = 1;
        System.out.println("Enter the two numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("An error occurred");
            return;
        }
        if(a == 0 || b == 0){
            System.out.println("The greatest common divisor is " + 1);
            return;
        }
        else
        for(i=2; i<=Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor is " + gcd);
    }
}
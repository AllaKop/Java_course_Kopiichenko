package com.sourceit.kopiichenko.l2_v2;

import java.util.Scanner;

public class Task4 {
//1!-2!+3!-4!+..+/-n!
    public static long factorial (int n) {
        long temp =1, result = 1;
        for (int a = 2; a <= n; a++) {
            temp = - temp * a;
            result += temp;
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum is " + factorial(n));
    }
}
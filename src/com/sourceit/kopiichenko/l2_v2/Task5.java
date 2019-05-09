package com.sourceit.kopiichenko.l2_v2;

public class Task5 {
    // Calculate how many six-digit numbers have an equal sum of the first three and last three digits.
    public static void main (String [] args) {

        int sum = 0;
        for(int i = 000000; i <= 999999; i++){
           if (i/100000 + (i/10000)%10 + (i/1000)%10 == (i/100)%10 + (i/10)%10 + i%10) {
               sum = sum + 1;
           }
        }
        System.out.println("The quantity of the six-digit numbers that have an equal sum of the first three and last three digits is " + sum);
        }
    }

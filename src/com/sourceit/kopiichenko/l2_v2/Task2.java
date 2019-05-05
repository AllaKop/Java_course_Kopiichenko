package com.sourceit.kopiichenko.l2_v2;

public class Task2 {
    // Написать программу, которая находит сумму цифр произвольного целого числа.
    public static void main(String[] args) {

        int num = 12658;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}

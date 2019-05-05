package com.sourceit.kopiichenko.l2_v2;

public class Task6 {
 /* Разместить в памяти массив из 20 элементов и заполнить его рядом Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, …
    В этом ряду каждое следующее число является суммой двух предыдущих.
     */
    public static void main(String[] args) {

        int[] a = new int[20];
        for (int b=0; b < a.length; b++) {
            if (b<2) {
                a [b] = 1;
            }
            else {
                a [b] = a[b-2]+a[b-1];
            }
            System.out.println (a[b]);
        }
    }
}

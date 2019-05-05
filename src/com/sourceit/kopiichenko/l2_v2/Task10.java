package com.sourceit.kopiichenko.l2_v2;

public class Task10 {
//Создать "треугольный" массив из 10 строк и заполнить его биномиальными коэффициентами (треугольник Паскаля)
    public static void main(String[] args) {

        int maxRows = 10;
        int r;
        int num;
        for (int i = 0; i <= maxRows; i++) {
            num = 1;
            r = i + 1;
            for (int j = maxRows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

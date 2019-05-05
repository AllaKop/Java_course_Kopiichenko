package com.sourceit.kopiichenko.l2_v2;

public class Task9 {
/* Создать целый шестимерный массив с двумя значениями в каждом измерении.
Заполнить массив числами из начала натурального ряда: 1, 2, 3, …
Сказать, сколько потребуется чисел ?
 */
    public static void main (String[] args) {
        showArray(fillArray());
    }

    public static int[][][][][][] fillArray() {
        int[][][][][][] sixdimarray = new int[2][2][2][2][2][2];
        char[] j = new char[6];
        for (int i = 0; i < 64; i++) {
            String name = "000000" + Integer.toBinaryString(i);
            j = name.substring(name.length() - 6, name.length()).toCharArray();
            sixdimarray[j[0] - 48][j[1] - 48][j[2] - 48][j[3] - 48][j[4] - 48][j[5] - 48] = i + 1;
        }
        return sixdimarray;
    }

    public static void showArray(int[][][][][][] array) {
        for (int[][][][][] temp : array) {
            for (int[][][][] temp1 : temp) {
                for (int[][][] temp2 : temp1) {
                    for (int[][] temp3 : temp2) {
                        for (int[] temp4 : temp3) {
                            for (int tmp : temp4) {
                                System.out.println(tmp + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
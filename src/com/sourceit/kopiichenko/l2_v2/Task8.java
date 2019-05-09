package com.sourceit.kopiichenko.l2_v2;

public class Task8 {
// Create a two-dimensional array and fill it in quincunx with letters "Ч" and "Б".
    public static void main (String[] args) {
        String [][] chessarray = new String [4][4];
        for (int i = 0; i < chessarray.length; i++) {
            for (int j = 0; j < chessarray[i].length; j++) {
                if ((i + j) % 2 == 0) System.out.print (" Ч");
                else System.out.print (" Б");
            }
            System.out.println();
        }
    }
}

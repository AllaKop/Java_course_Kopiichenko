package com.sourceit.kopiichenko.l2;

public class ChessArray {
    // Create a two-dimensional array and fill it in quincunx with letters "Ч" and "Б".

    private static final String [][] CHESS_ARRAY = new String [4][4];

    public static void main(String[] args) {
        for (int i = 0; i < CHESS_ARRAY.length; i++) {
            for (int j = 0; j < CHESS_ARRAY[i].length; j++) {
                if ((i + j) % 2 == 0) System.out.print(" Ч");
                else System.out.print(" Б");
            }
            System.out.println();
        }
    }
}

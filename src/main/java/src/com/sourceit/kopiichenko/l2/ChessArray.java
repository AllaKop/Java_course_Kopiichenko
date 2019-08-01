package com.sourceit.kopiichenko.l2;

import java.util.Scanner;

public class ChessArray {
    // Create a two-dimensional array and fill it in quincunx with letters "Ч" and "Б".

    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        char[][] chessArray = new char[arraySize][arraySize];
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" Ч");
                } else
                    System.out.print(" Б");
            }
            System.out.println();
        }
    }
}

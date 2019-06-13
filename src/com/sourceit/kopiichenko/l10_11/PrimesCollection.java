package com.sourceit.kopiichenko.l10_11;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimesCollection extends Thread {

    private static int rangeBeginning;
    private static int rangeEnding;
    private static int listSize = rangeEnding - rangeBeginning;
    private static ArrayList<Integer> numeralsRange = new ArrayList<>(listSize);
    private static int quantityOfThreads;
    private static int chunkSize;
    private static int index;
    private static ArrayList<Integer> listOfPrimes = new ArrayList<>();

    public int setRangeBeginning(int rangeBeginning) {
        System.out.println("Please enter the beginning of the range");
        Scanner scan = new Scanner(System.in);
        this.rangeBeginning = scan.nextInt();
        if (rangeBeginning < 0) {
            throw new IllegalArgumentException("Only positive numerals are accepted");
        } else {
            return rangeBeginning;
        }
    }

    public int getRangeBeginning() {
        return rangeBeginning;
    }

    public int setRangeEnding(int rangeEnding) {
        System.out.println("Please enter the end of the range");
        Scanner scan = new Scanner(System.in);
        this.rangeEnding = scan.nextInt();
        if (rangeEnding < 0) {
            throw new IllegalArgumentException("Only positive numerals are accepted");
        } else {

            return rangeEnding;
        }
    }

    public int getRangeEnding() {
        return rangeEnding;
    }

    public ArrayList<Integer> setNumeralsRange() {
        for ( int i = rangeBeginning; i <= rangeEnding; i++ ) {
            numeralsRange.add(i);
        }
        return numeralsRange;
    }

    public static ArrayList<Integer> getNumeralsRange() {
        return numeralsRange;
    }

    public int setQuantityOfThreads(int quantityOfThreads) {
        this.quantityOfThreads = quantityOfThreads;
        System.out.println("Please enter the quantity of the threads");
        Scanner scan = new Scanner(System.in);
        quantityOfThreads = scan.nextInt();
        if (quantityOfThreads <= 0) {
            throw new IllegalArgumentException("Only positive numerals are accepted");
        } else {
            return quantityOfThreads;
        }
    }

    public int getQuantityOfThreads() {
        return quantityOfThreads;
    }

    public int setChunkSize() {
        if (listSize != 0 && quantityOfThreads != 0) {
            if (listSize % quantityOfThreads == 0) {
                chunkSize = listSize / quantityOfThreads;
            } else {
                chunkSize = listSize / (quantityOfThreads - 1);
            }
        }
        return chunkSize;
    }

    public static int getChunkSize() {
        return chunkSize;
    }

    public ArrayList<Integer> listSegregation(int index) {
        this.index = index;
        int start = index * chunkSize;
        int end = Math.min(start + chunkSize, numeralsRange.size());

        if (start > end) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of the list range <0," + (size() - 1) + ">");
        } else {
            return new ArrayList<>(numeralsRange.subList(start, end));
        }
    }

    public int size() {
        return (int) Math.ceil((double) numeralsRange.size() / (double) chunkSize);
    }

    @Override
    public void run() {
        super.run();

    }

    public static ArrayList<Integer> setListOfPrimes(int number) {
        for ( int i = rangeBeginning; i <= rangeEnding; i++ ) {
            int root = (int) Math.sqrt(number);
            if (number % numeralsRange.get(i) != 0 && numeralsRange.get(i) > root) {
                listOfPrimes.add(number);
            }
        }
        return listOfPrimes;
    }

    public ArrayList<Integer> getListOfPrimes() {
        return listOfPrimes;
    }

    public static void main(String[] args) {
        PrimesCollection myPrimesCollection = new PrimesCollection();
        myPrimesCollection.setRangeBeginning(rangeBeginning);
        myPrimesCollection.setRangeEnding(rangeEnding);
        myPrimesCollection.getRangeBeginning();
        myPrimesCollection.getRangeEnding();
        myPrimesCollection.setNumeralsRange();
        System.out.println(myPrimesCollection.getNumeralsRange());
        myPrimesCollection.setQuantityOfThreads(quantityOfThreads);
        myPrimesCollection.getQuantityOfThreads();
        myPrimesCollection.setChunkSize();
        myPrimesCollection.getChunkSize();
        System.out.println(myPrimesCollection.listSegregation(index));
    }
}



package com.sourceit.kopiichenko.l10_11;

import spals.shaded.com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimesCollection extends Thread implements Runnable {

    private static int rangeBeginning;
    private static int rangeEnding;
    private static int listSize;
    private static List<Integer> numeralsRange = new ArrayList<>(listSize);
    private static int quantityOfThreads;
    private static int chunkSize;
    private static List<Thread> threads = new ArrayList<>(quantityOfThreads);
    private static List<Integer> listOfPrimes = new ArrayList<>();

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

    public List<Integer> setNumeralsRange() {
        for ( int i = rangeBeginning; i <= rangeEnding; i++ ) {
            numeralsRange.add(i);
        }
        return numeralsRange;
    }

    public static List<Integer> getNumeralsRange() {
        return numeralsRange;
    }

    public int setQuantityOfThreads(int quantityOfThreads) {
        System.out.println("Please enter the quantity of the threads");
        Scanner scan = new Scanner(System.in);
        this.quantityOfThreads = scan.nextInt();
        if (quantityOfThreads < 0) {
            throw new IllegalArgumentException("The quantity of threads must be more than 0");
        } else {
            return quantityOfThreads;
        }
    }

    public int getQuantityOfThreads() {
        return quantityOfThreads;
    }

    public int setChunkSize() {
        listSize = (rangeEnding + 1) - rangeBeginning;
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

    public void listSegregation() {
        List<List<Integer>> lists = Lists.partition(numeralsRange, chunkSize);
        for ( List<Integer> sublist : lists ) {
            System.out.println("Sublists " + sublist);
        }
    }

    public List<Thread> createThreads() {
        for ( int i = 1; i <= quantityOfThreads; i++ ) {
            threads.add(new Thread("Thread #" + i) {
                @Override
                public void run() {
                    for ( int i = rangeBeginning; i <= rangeEnding; i++ ) {
                        synchronized (PrimesCollection.class) {
                            if (i % 2 != 0) {
                                listOfPrimes.add(i);
                            }
                        }
                        System.out.println("List of primes " + listOfPrimes);
                    }
                }
            });
        }
        return threads;
    }

    public void startThreads() {
        System.out.println("Threads in list: ");
        for ( Thread currentThread : threads ) {
            currentThread.start();
            try {
                Thread.sleep(1000);
            } catch (Exception exception) {
            }
        }
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
        myPrimesCollection.listSegregation();
        myPrimesCollection.createThreads();
        myPrimesCollection.startThreads();
    }
}



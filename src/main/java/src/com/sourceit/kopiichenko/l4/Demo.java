package com.sourceit.kopiichenko.l4;

import java.util.Scanner;

import static com.sourceit.kopiichenko.l4.Circle.*;
import static com.sourceit.kopiichenko.l4.Matrix.*;
import static com.sourceit.kopiichenko.l4.Vector.*;

/**
 * Class that implements all classes;
 * Circle
 * Matrix
 * Vector
 */
public class Demo {
    public static void main(String[] args) {

        /**
         * Implementation of the methods of the class Circle
         */

        Circle firstCircle = new Circle();
        System.out.println("Please enter the coordinates of the center of your first circle (x;y)" + centerX + centerY);
        Scanner scan = new Scanner(System.in);
        firstCircle.centerX = scan.nextDouble();
        firstCircle.centerY = scan.nextDouble();
        System.out.println("Please enter the radius of your first circle (x;y)" + radius);
        firstCircle.radius = scan.nextDouble();
        System.out.println("Please enter how much do you want to move your circumference" + movePace);
        movePace = scan.nextDouble();
        firstCircle.move();
        System.out.println("Your circle has been moved. The new coordinates of the circle is the following " + centerX + centerY);
        System.out.println("Please enter the coordinates of the point (x;y)" + pointX + pointY);
        pointX = scan.nextDouble();
        pointY = scan.nextDouble();
        firstCircle.checkIfThePointIsInsideTheCircle();

        Circle secondCircle = new Circle();
        System.out.println("Please enter the coordinates of the center of your second circle (x;y)" + secondCenterX + secondCenterY);
        secondCircle.secondCenterX = scan.nextDouble();
        secondCircle.secondCenterY = scan.nextDouble();
        System.out.println("Please enter the radius of your second circle (x;y)" + secondRadius);
        secondCircle.secondRadius = scan.nextDouble();
        secondCircle.checkIfTheSecondCircleIsInsideTheCircle();

        /**
         * Implementation of the methods of the class Matrix
         */

        Matrix objectMatrix1 = new Matrix();
        System.out.println("Please enter the size of your first matrix" + matrix1Size);
        matrix1Size = scan.nextInt();
        System.out.println("Please enter the range of first matrix elements values");
        objectMatrix1.elementsRangeForMatrix1 = scan.nextInt();
        objectMatrix1.fillTheMatrix1();
        Matrix objectMatrix2 = new Matrix();
        System.out.println("Please enter the size of your second matrix" + matrix2Size);
        matrix2Size = scan.nextInt();
        System.out.println("Please enter the range of second matrix elements values");
        objectMatrix2.elementsRangeForMatrix2 = scan.nextInt();
        objectMatrix2.fillTheMatrix2();
        objectMatrix1.sum();
        System.out.println("Please enter how much do you want to multiply your first matrix" + number);
        objectMatrix1.number = scan.nextInt();
        objectMatrix1.matrixTimesNumber();
        objectMatrix1.matrix1TimesMatrix2();
        objectMatrix1.matrixTransposition();

        /**
         * Implementation of the methods of the class Vector
         */

        Vector linkedArray = new Vector(element, index);
        System.out.println("Please specify size of your array" + size);
        linkedArray.size = scan.nextInt();
        linkedArray.ensureCapacity();
        linkedArray.addLinkToTheArray(element);
        linkedArray.getElement(index);
        linkedArray.deleteElement(index);
        linkedArray.displayTheArray();
        linkedArray.clearTheArray();

    }
}

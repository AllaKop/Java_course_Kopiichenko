package com.sourceit.kopiichenko.l4;

import static java.lang.Math.PI;

public class Circle {
    private final static double MATH_SQUARE = 2;
    /**
     * Fields for the first circle.
     * Center coordinates, specific point on the circumference of the circle and radius.
     */
    static double centerX;
    static double centerY;
    static double radius;
    static double pointX;
    static double pointY;
    /**
     * Field for moving the circle by n-times.
     */
    static double movePace;
    /**
     * Field for the second circle.
     * Center coordinates and radius.
     */
    static double secondCenterX;
    static double secondCenterY;
    static double secondRadius;

    /**
     * Moves circle to the specific place on Cartesian plane.
     */
    public void move() {
        if (centerX == 0 && centerY == 0 && radius == 0) {
            throw new IllegalArgumentException("The circle is the null point");
        } else {
            centerX *= movePace;
            centerY *= movePace;
        }
    }

    /**
     * Checking if the specific point is inside the circle.
     */
    public static void checkIfThePointIsInsideTheCircle() {
        if (Math.pow((pointX - centerX), MATH_SQUARE) + Math.pow((pointY - centerY), MATH_SQUARE) <= radius) {
            System.out.println("The point is inside the circle");
        } else {
            System.out.println("The point is not inside the circle");
        }
    }

    /**
     * Checking if the second circle is inside the first one.
     * First checkpoint is to compare the squares of the circles.
     * Second checkpoint is to compare distances between radii and centres.
     *
     * @throws IllegalArgumentException if the second circle is not inside the first on.
     */

    public static void checkIfTheSecondCircleIsInsideTheCircle() {
        double squareCircle = PI * Math.pow(radius, MATH_SQUARE);
        double squareSecondCircle = PI * Math.pow(secondRadius, MATH_SQUARE);
        double distanceBetweenCentres = Math.sqrt(Math.pow(centerX - secondCenterX, MATH_SQUARE) + Math.pow(centerY - secondCenterY, MATH_SQUARE));
        double differenceBetweenRadii = radius - secondRadius;
        if (squareCircle <= squareSecondCircle) {
            throw new IllegalArgumentException("The second circle is not inside the first one");
        } else if (distanceBetweenCentres <= differenceBetweenRadii) {
            System.out.println("The second circle is inside the first one");
        } else {
            throw new IllegalArgumentException("The second circle is not inside the first one");
        }
    }
}
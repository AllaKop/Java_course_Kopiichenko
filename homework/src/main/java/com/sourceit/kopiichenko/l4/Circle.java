package com.sourceit.kopiichenko.l4;

public class Circle {
    /**
     * Constant for Math.pow
     */
    private final double MATH_SQUARE = 2;

    /**
     * Fields for a circle.
     * Center coordinates and radius.
     */
    private double centerX;
    private double centerY;
    private double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    /**
     * Moves a circle
     *
     * @param movePace
     */
    void move(double movePace) {
        this.centerX *= movePace;
        this.centerY *= movePace;
    }

    /**
     * Checks if a point is inside a circle
     *
     * @param pointX
     * @param pointY
     * @return
     */
    boolean isPointInsideCircle(double pointX, double pointY) {
        return (Math.pow((pointX - centerX), MATH_SQUARE) + Math.pow((pointY - centerY), MATH_SQUARE) <= radius);
    }

    /**
     * Checks if a circle is inside a circle.
     *
     * @param firstCircle
     * @param secondCircle
     * @return
     */
    boolean isSecondCircleInsideFirstOne(Circle firstCircle, Circle secondCircle) {
        firstCircle = new Circle(centerX, centerY, radius);
        secondCircle = new Circle(centerX, centerY, radius);
        double distanceBetweenCentres = Math.sqrt(Math.pow(firstCircle.centerX - secondCircle.centerX, MATH_SQUARE)
                + Math.pow(firstCircle.centerY - secondCircle.centerY, MATH_SQUARE));
        double differenceBetweenRadii = firstCircle.radius - secondCircle.radius;
        return (distanceBetweenCentres <= differenceBetweenRadii);
    }

    /**
     * Displays a circle.
     */
    void displayCircle() {
        System.out.println("Center coordinates are " + "(" + centerX + ";" + centerY + ")");
        System.out.println("Radius " + radius);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5, 2, 6);
        Circle circle2 = new Circle(5, 5, 3);
        circle1.move(5);
        circle1.isPointInsideCircle(2, 5);
        circle1.isSecondCircleInsideFirstOne(circle1, circle2);
        circle1.displayCircle();
    }
}

package com.sourceit.kopiichenko.l4;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CircleTest {

    Circle circle;

    @Before
    public void setUp() {
        circle = new Circle();
    }

    @Test
    public void move() {
        circle.centerX = 2;
        circle.movePace = 2;
        circle.move();
        assertEquals(4, 4);
    }

    @Test
    public void checkIfThePointIsInsideTheCircle() {
        circle.pointX = 2;
        circle.pointY = 3;
        circle.centerX = 5;
        circle.centerY = 2;
        circle.radius = 15;
        circle.checkIfThePointIsInsideTheCircle();
        assertEquals(10, 10);
    }

    @Test
    public void checkIfTheSecondCircleIsInsideTheCircle() {
        circle.centerX = 5;
        circle.centerY = 5;
        circle.secondCenterX = 3;
        circle.secondCenterY = 6;
        circle.radius = 10;
        circle.secondRadius = 5;
        circle.checkIfTheSecondCircleIsInsideTheCircle();
        assertEquals(3, 3);
    }
}
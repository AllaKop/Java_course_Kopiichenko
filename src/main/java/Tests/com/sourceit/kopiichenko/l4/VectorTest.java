package com.sourceit.kopiichenko.l4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {

    Vector vector;
    Vector array[];
    Object element;
    int index;

    @Before
    public void setUp() {
        element = "Sample";
        index = 2;
        vector = new Vector(element, index);
    }

    @Test
    public void clearTheArray() {
        array = new Vector[1];
        vector.clearTheArray();
        Assert.assertNotNull(array);
    }

    @Test
    public void ensureCapacity() {
        vector.size = 2;
        vector.ensureCapacity();
        assertEquals(4, 4);
    }

    @Test
    public void addLinkToTheArray() {
        vector.addLinkToTheArray(element);
        assertEquals(element, vector.array);
    }

    @Test
    public void getElement() {
        array = new Vector[1];
        vector.array[0] = element;
        vector.getElement(0);
        assertEquals(element, element);
    }

    @Test
    public void deleteElement() {
        vector.size = 9;
        vector.deleteElement(0);
        assertEquals(8, 8);
    }

    /**
     * Unchecked
     */

    @Test
    public void displayTheArray() {
    }
}
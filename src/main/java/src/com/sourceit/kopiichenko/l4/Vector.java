package com.sourceit.kopiichenko.l4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vector {

    Object[] array = new Object[size];
    static int size;
    Object[] newArray;
    static Object element;
    static int index;


    Vector(Object element, int index) {
        this.element = element;
        this.index = index;
    }

    /**
     * Clear values of the elements of the array.
     */
    public void clearTheArray() {
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = null;
        }
    }

    /**
     * Increases the capacity of the array to ensure it can hold necessary number of elements.
     * Creating new array with increased capacity.
     */
    public void ensureCapacity() {
        size *=2;
        newArray = new Array[size];
    }

    /**
     * Adding values of the initial array to the new array.
     * Assign array value of the newArray.
     *
     * @param element is element to be appended to the array.
     */
    public void addLinkToTheArray(Object element) {
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        array[size++] = element;
    }

    /**
     * Returns the element at the specified position in the array.
     *
     * @param index index of the element to return
     * @return the element at the specified position in the array.
     */
    public Object getElement(int index) {
        return array[index];
    }

    /**
     * Removes the element at the specified position in the array.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).
     *
     * @param index the index of the element to be removed
     * @return the element that was removed from the list
     */
    public Object deleteElement(int index) {
        Object oldValue = array[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(array, index + 1, array, index,
                    numMoved);
            array[--size] = null;
        }
        return oldValue;
    }

    /**
     * Displaying values of the elements  of the array.
     */
    public void displayTheArray() {

        System.out.println(Arrays.deepToString(array));
    }
}
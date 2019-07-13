package com.sourceit.kopiichenko.l7;

import java.util.*;

/**
 * An ordered list of products. Implements interface List and has inner class Itr which implement interface iterator.
 */
public class ProductsList implements List {
    /**
     * Define initial capacity of the products list
     */
    private int capacity = 1000;
    /**
     * The size of the ArrayList (the number of elements it contains).
     */
    private int size = 0;
    /**
     * Create products array with initial capacity.
     */
    private Object[] products = new Object[capacity];

    /**
     * Returns the number of elements in this list.
     *
     * @return
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true, if the list does not contain any elements in it.
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns true, if the list contains sought-for element.
     *
     * @param o
     * @return
     */
    @Override
    public boolean contains(Object o) {
        boolean flag = false;
        for ( int i = 0; i < size(); i++ ) {
            if (o.equals(products[i])) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
     *
     * @return
     */
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(products, size);
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * @param o
     * @return
     */
    @Override
    public boolean add(Object o) {
        boolean flag;
        if (size() < capacity) {
            products[size] = o;
            size++;
            flag = true;
        } else {
            capacity += 500;
            products[size] = o;
            size++;
            flag = true;
        }
        return flag;
    }

    /**
     * Removes the specified element from the list if it present.
     *
     * @param o
     * @return
     */
    @Override
    public boolean remove(Object o) {
        boolean flag = false;
        for ( int i = 0; i < size(); i++ ) {
            if (o.equals(products[i])) {
                products[i] = null;
                size--;
                flag = true;
            }
        }
        return flag;
    }

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the
     * specified collection's Iterator.
     *
     * @param c
     * @return
     */
    @Override
    public boolean addAll(Collection c) {
        for ( Object object : c )
            if (add(object)) {
            }
        return true;
    }

    /**
     * Inserts all of the elements in the specified collection into this list, starting at the specified position.
     *
     * @param index
     * @param c
     * @return
     */
    @Override
    public boolean addAll(int index, Collection c) {
        for ( Object object : c ) {
            add(index++, object);
        }
        return true;
    }

    /**
     * Sorts this list according to the order induced by the specified
     * {@link Comparator}.
     *
     */

    /**
     * Removes all of the elements from this list.
     */
    @Override
    public void clear() {
        for ( int i = 0; i < size(); i++ ) {
            products[size] = null;
        }
        size = 0;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        return products[index];
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index
     * @param element
     * @return
     */
    @Override
    public Object set(int index, Object element) {
        products[index] = element;
        return products[index];
    }

    /**
     * Appends the specified element to the specific position in this list.
     *
     * @param index
     * @param element
     */
    @Override
    public void add(int index, Object element) {
        if (index < size) {
            System.arraycopy(products, index, products, index + 1, size - index);
            products[index] = element;
            size++;
        }
    }

    /**
     * Removes the element at the specified position in this list.
     *
     * @param i
     * @return
     */
    @Override
    public Object remove(int i) {
        if (products[i] != null) {
            products[i] = null;
            System.out.println("Item with index: " + i + " removed!!!");
            size--;
        }
        return products[i];
    }

    /**
     * Returns index of the specific element.
     *
     * @param o
     * @return
     */
    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for ( int i = 0; i < size; i++ ) {
                if (products[i] == null) {
                    return i;
                }
            }
        } else {
            for ( int i = 0; i < size; i++ ) {
                if (o.equals(products[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Returns last index of the list.
     *
     * @param o
     * @return
     */
    @Override
    public int lastIndexOf(Object o) {
        int index = 0;
        for ( int i = 0; i < products.length; i++ ) {
            if (o.equals(products[i])) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Returns a list iterator over the elements in this list (in proper sequence).
     *
     * @return
     */
    @Override
    public ListIterator listIterator() {
        return null;
    }

    /**
     * Returns a list iterator over the elements in this list (in proper sequence),
     * starting at the specified position in the list.
     *
     * @param index
     * @return
     */
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    /**
     * Creates sublists from-to specified indices of a list.
     *
     * @param fromIndex
     * @param toIndex
     * @return
     */
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    /**
     * Retains only the elements in this list that are contained in the
     * specified collection (optional operation).  In other words, removes
     * from this list all of its elements that are not contained in the
     * specified collection.
     *
     * @param c
     * @return
     */
    @Override
    public boolean retainAll(Collection c) {
        for ( Object e : c )
            if (!contains(e)) {
                return false;
            }
        return true;
    }

    /**
     * Removes from this list all of its elements that are contained in the
     * specified collection (optional operation).
     *
     * @param c
     * @return
     */
    @Override
    public boolean removeAll(Collection c) {
        Iterator<?> it = iterator();
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
            }
        }
        return true;
    }

    /**
     * Returns <tt>true</tt> if this list contains all of the elements of the
     * specified collection.
     *
     * @param c
     * @return
     */
    @Override
    public boolean containsAll(Collection c) {
        for ( Object e : c )
            if (!contains(e)) {
                return false;
            }
        return true;
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence (from first to last element).
     *
     * @param a
     * @return
     */
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return new Itr();
    }

    /**
     * Inner class which allows to perform the given action for each element of the list
     * until all elements have been processed or the action throws an
     * exception.
     */
    class Itr implements Iterator {

        /**
         * Fields
         */
        private int cursor;
        private int lastRet = -1;

        /**
         * Returns {@code true} if the iteration has more elements.
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        /**
         * Returns the next object in an iteration.
         *
         * @return
         */
        @Override
        public Object next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] array = ProductsList.this.products;
            if (i >= array.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return array[lastRet = i];
        }

        /**
         * Removes from the underlying collection the last element returned
         * by this iterator (optional operation).
         */
        @Override
        public void remove() {
            if (lastRet < 0) {
                throw new IllegalStateException();
            }
            try {
                ProductsList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }
    }
}
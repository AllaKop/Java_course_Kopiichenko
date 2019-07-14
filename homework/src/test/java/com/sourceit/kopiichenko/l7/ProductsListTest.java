package com.sourceit.kopiichenko.l7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsListTest {

    @Test
    void add() {
        Phone phone = new Phone("sss", "sss", "sss", "sss", true);
        ProductsList list = new ProductsList();
        list.add(phone);
        assertTrue (list.get(0) == phone);
    }

    @Test
    void remove() {
        Phone phone = new Phone("sss", "sss", "sss", "sss", true);
        ProductsList list = new ProductsList();
        list.add(phone);
        list.remove(phone);
        assertTrue (list.size() == 0);
    }

    @Test
    void get() {
        Phone phone = new Phone("sss", "sss", "sss", "sss", true);
        ProductsList list = new ProductsList();
        list.add(phone);
        assertEquals(phone, list.get(0));
    }

    @Test
    void add1() {
        Phone phone = new Phone("sss", "sss", "sss", "sss", true);
        Phone phone1 = new Phone("aaa", "aaa", "aaa", "aaa", false);
        Phone phone2 = new Phone("bbb", "bbb", "bbb", "bbb", false);
        Phone phone3 = new Phone("ccc", "ccc", "ccc", "ccc", true);
        ProductsList list = new ProductsList();
        list.add(phone);
        list.add(phone1);
        list.add(0,phone2);
        list.add(1,phone3);
        assertEquals (phone2, list.get(0));
    }

    @Test
    void remove1() {
        Phone phone = new Phone("sss", "sss", "sss", "sss", true);
        Phone phone1 = new Phone("aaa", "aaa", "aaa", "aaa", false);
        Phone phone2 = new Phone("bbb", "bbb", "bbb", "bbb", false);
        Phone phone3 = new Phone("ccc", "ccc", "ccc", "ccc", true);
        ProductsList list = new ProductsList();
        list.add(phone);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        list.remove(2);
        assertNull(list.get(2));
    }
}
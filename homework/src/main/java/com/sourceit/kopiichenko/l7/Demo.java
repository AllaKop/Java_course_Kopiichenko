package com.sourceit.kopiichenko.l7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product phone = new Phone("1", "Iphone7", "xxx", "Iphone", false);
        Product phone1 = new Phone("2", "Iphone8", "xxxx", "Iphone", false);
        Product phone2 = new Phone("3", "Iphone7+", "xxxx", "Iphone", false);
        Product phone3 = new Phone("4", "Nokia1", "xx", "Nokia", true);
        Product phone4 = new Phone("5", "Nokia2", "xx", "Nokia", true);

        ProductsList modifiableList = new ProductsList();
        modifiableList.add(phone);
        modifiableList.add(phone1);
        modifiableList.add(phone2);
        modifiableList.add(phone3);
        modifiableList.add(phone4);
        ProductsList list = new ProductsList();
        list.add(phone4);
        list.add(phone3);
        list.add(phone2);
        list.add(phone1);
        list.add(phone);
        List<Object> unmodifiableList = Collections.unmodifiableList(list);
        ProductsList sharedList = new ProductsList();
        sharedList.addAll(modifiableList);
        sharedList.addAll(unmodifiableList);

        Comparator<Product> cmp = Comparator
                .comparing((Product product) -> product.id)
                .thenComparing((Product product) -> product.name)
                .thenComparing(product -> product.price);

    }
}

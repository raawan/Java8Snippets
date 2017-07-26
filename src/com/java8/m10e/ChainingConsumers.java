package com.java8.m10e;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by minal on 5/10/17.
 */
public class ChainingConsumers {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello";
        Consumer<String> consumer1 = str -> System.out.println(str);
        Consumer<String> consumer2 = str -> System.out.println("....HRU?");

        consumer1.andThen(consumer2).accept(supplier.get());
    }
}

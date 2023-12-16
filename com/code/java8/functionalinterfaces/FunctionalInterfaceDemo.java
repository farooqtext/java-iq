package com.code.java8.functionalinterfaces;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void printResult();

    default void printName() {
        System.out.println("Print Name");
    }

    static void printAge() {
        System.out.println("Print Age");
    }
}

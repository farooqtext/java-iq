package com.code.java8;

import java.util.function.BiConsumer;

public class LambdaDemo {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.print(a + b);
        biConsumer.accept(3,5);

        FunctionalInterfaceDemo functionalInterfaceDemo = () -> System.out.println("Print");
        functionalInterfaceDemo.printResult();
    }
}

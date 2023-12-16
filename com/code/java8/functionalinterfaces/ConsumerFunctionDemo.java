package com.code.java8.functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerFunctionDemo {

    public static void main(String[] args) {
//        Using Lambda Expression
        Consumer<Integer> squareMe = i -> System.out.println(i * i);
        squareMe.accept(15);

        Consumer<Integer> squareMe1 = i -> System.out.println(i * i);
        squareMe1.accept(15);

//        Using Method Reference
        Consumer<Integer> sqareMe = ConsumerFunctionDemo::squareMe;
        sqareMe.accept(5);

//        ConsumerChaining
        sqareMe.andThen(squareMe1).accept(3);

//        BiConsumer
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a*b);
        biConsumer.accept(3,5);
    }

    public static void squareMe(int i) {
        System.out.println(i * i);
    }
}

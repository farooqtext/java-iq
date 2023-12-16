package com.code.java8;

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

    }

    public static void squareMe(int i) {
        System.out.println(i * i);
    }
}

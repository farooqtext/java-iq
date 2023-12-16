package com.code.java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> squareMe = i -> i * i;
        Integer result = squareMe.apply(5);
        System.out.println(result);

        Function<Integer, Integer> cubeMe = i -> i * i * i;
        Integer result1 = cubeMe.apply(2);
        System.out.println(result1);

//        Functional Chaining
        Integer chainResult = squareMe.andThen(cubeMe).apply(3);
        System.out.println(chainResult);
    }
}

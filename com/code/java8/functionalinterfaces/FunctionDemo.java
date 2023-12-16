package com.code.java8.functionalinterfaces;

import java.util.function.BiFunction;
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

//        BiFunction
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        Integer resultBiFunction = biFunction.apply(2, 5);
        System.out.println(resultBiFunction);
    }
}

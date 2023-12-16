package com.code.java8.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunctionDemo {

    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() >= 10;
        boolean validateString = checkLength.test("Hello this is Test");

        Predicate<String> checkValue = x -> x.length() % 2 == 0;
        boolean valueIs = checkValue.test("Code Decode");
//        System.out.println(valueIs);

//        Predicate Joining
        boolean combinedResult = checkLength.and(checkValue).test("Code Decode");
//        System.out.println(combinedResult);

//        BiPredicate
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a + b >=5;
        System.out.println(biPredicate.test(4,1));
    }
    
}

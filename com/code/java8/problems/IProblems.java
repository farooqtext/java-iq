package com.code.java8.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IProblems {

    public static void main(String[] args) {
        findDuplicatesWithoutJava8();
    }

    public static void findDuplicates() {
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 10, 50, 60, 60, 60);
        Set<Integer> uniqueSet = new HashSet<>();
        list.stream().filter(x -> !uniqueSet.add(x)).collect(Collectors.toSet()).forEach(System.out::println);
    }

    public static void findDuplicatesWithoutJava8() {
        int[] arr = {10, 20, 30, 20, 10, 50, 60, 60, 60};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

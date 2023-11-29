package com.code.logics;

import java.util.Objects;
import java.util.stream.Collectors;

public class StringProblems {

    public static void main(String[] args) {
//        String stringReverse = reverseStringJava8("Hello");
//        System.out.println(stringReverse);

        String input = "HelloWorld!";

        String reversedString = reverseStringWithHalfApproach(input);

        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String inputString) {
        StringBuilder newString = new StringBuilder();
        char[] charArray = inputString.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            newString.append(charArray[i]);
        }
        return Objects.requireNonNull(newString).toString();
    }

    public static String reverseStringWithHalfApproach(String inputString) {

        StringBuilder reverse = new StringBuilder();
        for (int i = 0; i < inputString.length() / 2; i++) {
            int front = i;
            int back = reverse.length() - 1 - i;
            char frontChar = inputString.charAt(front);
            char backChar = inputString.charAt(back);
            reverse.setCharAt(front, frontChar);
            reverse.setCharAt(back, backChar);
        }
        return reverse.toString();
    }

    private static String reverseStringJava8(String input) {
        return input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            java.util.Collections.reverse(list);
                            return list.stream().collect(Collectors.joining());
                        }
                ));
    }
}

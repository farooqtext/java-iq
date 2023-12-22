package com.code.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(12);
        list.add(16);
        list.add(13);
        list.add(11);

//        If you want to filter data using streams
        List modifiedList = list.stream().filter(x -> x >= 15).collect(Collectors.toList());
        modifiedList.stream().forEach(x -> System.out.println(x));

//        If you want to perform some operation on the data
        list.stream().map(i -> i * i).forEach(x -> System.out.println(x));

        List collectedList = list.stream().filter(x -> x >= 15).collect(Collectors.toList());

        long streamCount = collectedList.stream().count();

        Stream sortedList = list.stream().sorted((i1, i2) -> i1.compareTo(i2));
        sortedList.forEach(x -> System.out.println(x));

        Integer minimum = list.stream().min((x1, x2) -> x1.compareTo(x2)).get();
        System.out.println(minimum);

        Integer maximum = list.stream().max((x1, x2) -> x1.compareTo(x2)).get();
        System.out.println(maximum);

        Object[] objArray = list.stream().toArray();
        for (Object obj : objArray) {
            System.out.println(obj);
        }

        Stream<Integer> streamArray = Stream.of(2, 5, 2, 8);

        List list2 = list.stream().filter(x -> x % 2 == 0).peek(System.out::println)
                .map(x -> x + 2).filter(x -> x >= 5)
                .map(x -> x * 2).collect(Collectors.toList());
        System.out.println(list2);

        Integer count = list.stream().reduce((a,b)-> a+b).get();
        System.out.println(count);

        list.stream().limit(3).forEach(System.out::println);

        list.stream().skip(2).forEach(System.out::println);


        Optional<String> optionalWithValue = Optional.of("Hello, Optional!");
        // Getting the value (unsafe, may throw NoSuchElementException)
        String value = optionalWithValue.get();
        System.out.println("Value: " + value);

        // Using orElse to provide a default value
        String defaultValue = optionalWithValue.orElse("Default Value");
        System.out.println("Value or Default: " + defaultValue);

        // Using orElseGet with a Supplier for lazy default value computation
        String lazyDefault = optionalWithValue.orElseGet(() -> generateDefaultValue());
        System.out.println("Value or Lazy Default: " + lazyDefault);
    }

    private static String generateDefaultValue() {
        System.out.println("Generating Default Value...");
        return "Lazy Default Value";
    }
}

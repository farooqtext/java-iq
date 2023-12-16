package com.code.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    }
}

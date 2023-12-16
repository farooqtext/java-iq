package com.code.java8.functionalinterfaces;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunctionDemo {
    public static void main(String[] args) {
        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
    }
}

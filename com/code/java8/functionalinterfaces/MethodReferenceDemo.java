package com.code.java8.functionalinterfaces;


public class MethodReferenceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = Test::printName;
        functionalInterfaceDemo.printResult();
    }
}
class Test {
    public static void printName() {
        System.out.println("Hello");
    }
}

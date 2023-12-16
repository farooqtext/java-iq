---
id: fx5ktnnk
title: Java8 Features
file_version: 1.1.3
app_version: 1.18.37
---

[<--VIDEO-->](https://www.youtube.com/watch?v=oUdENE7ljjw&list=PLyHJZXNdCXsdeusn4OM33415DCMQ6sUKy&index=2)

<br/>

# Why Java8 Introduced ?

1.  Java8 was introduced to make code concise and more readable.

2.  Java8 introduced **_functional programming_** with _Lambda expressions_ which creates a concise code base.

3.  To improve the _performance_ and _scalability_ of Java applications.

# What are new features introduced in Java8 ?

## **Lambda expressions:**

*   Lambda expressions allow you to write concise and expressive code. They are a type of **_anonymous function_** that can be used anywhere a function is required.

*   Lambda expressions are referenced by functional interfaces and **_they will be executed when we call the abstract method of functional interface_**.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/LambdaDemo.java
```java
9              BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.print(a + b);
10             biConsumer.accept(3,5);
```

<br/>

## **Functional interfaces:**

*   A functional interface is an interface that contains **_only one abstract method_**.

*   Functional interface must / should have at least one abstract method.

*   Functional interface can contain any number of **_default and static methods_**.

*   Functional interfaces holds the references of Lambda expressions.

*   We can create our own functional interface.

    *   Mark the class as @FuntionalInterface (Optional).

    *   Create one abstract method.

    *   Can have nothing to any number of default and static methods.

    *   Must / should create at least one abstract method.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/FunctionalInterfaceDemo.java
```java
3      @FunctionalInterface
4      public interface FunctionalInterfaceDemo {
5      
6          void printResult();
7      
8          default void printName() {
9              System.out.println("Print Name");
10         }
11     
12         static void printAge() {
13             System.out.println("Print Age");
14         }
15     }
```

<br/>

## **Method references:**

*   Method references allow you to **_refer to an existing method without having to call it_**.

*   Method reference is the replacement of Lambda expression.

*   It gives the feature of code reusability.

> **Code reusable** - Whenever there is an existing implementation code available then we can use method reference. If existing code is not available then we can go for writing the code using lambda expression.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/MethodReferenceDemo.java
```java
4      public class MethodReferenceDemo {
5          public static void main(String[] args) {
6              FunctionalInterfaceDemo functionalInterfaceDemo = Test::printName;
7              functionalInterfaceDemo.printResult();
8          }
9      }
10     class Test {
11         public static void printName() {
12             System.out.println("Hello");
13         }
14     }
```

<br/>

## **Default methods:**

Interfaces can now have default methods. **_This allows you to add new functionality to an interface without breaking existing code._**

> You can override the default method by keeping the same method signature (need to add public access modifier in overridden class).

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/FunctionalInterfaceDemo.java
```java
8          default void printName() {
9              System.out.println("Print Name");
10         }
```

<br/>

## **Optional:**

The Optional class represents a value that may or may not be present. This can be useful for avoiding NullPointerExceptions.

## **Stream API:**

The Stream API provides a powerful way to process collections of data. **_Streams are lazy, so they are only evaluated when necessary_**.

## **Parallel array sorting:**

The Arrays class now has a **_parallelSort()_** method that can be used to sort arrays in parallel.

## **Date API**

<br/>

# **Why static methods were introduced in java8 ?**

Creating class and then its object is costly. Since interface can never contain _Constructors, Static blocks._ Hence we don't need to create object which need low memory and improves performance.

<br/>

# Predicate Functional Interface ?

Predicate is a functional interface having only one abstract method, i.e public boolean test(T t) **to check the boolean conditions.**

Predicate takes 1 input and always **returns boolean**.

_Advantage of Predicate:_

**Code Reusability:** If you have same condition being used multiple times, then Instead of writing multiple if conditions or ternary conditions to validate, we will define the logic at one place as lamba expression like below and pass different types of values as input. So logic will be at one place and only type of input data will change.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/PredicateFunctionDemo.java
```java
8              Predicate<String> checkLength = s -> s.length() >= 10;
9              boolean validateString = checkLength.test("Hello this is Test");
```

<br/>

### Predicate Joining:

We can join multiple condition use and() or() negate()

> we use negate() for the opposite of value. If the result is true, then adding negate() will make the value false.
> 
> Negate works with only one predicate.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/PredicateFunctionDemo.java
```java
16             boolean combinedResult = checkLength.and(checkValue).test("Code Decode");
17             System.out.println(combinedResult);
```

<br/>

# Consumer Functional Interface ?

Consumer is a functional interface having only one abstract method, i.e public void accept(T t) that accepts only one argument and **doesn't return nothing**.

Consumer takes 1 input and return nothing.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/ConsumerFunctionDemo.java
```java
7          public static void main(String[] args) {
8      //        Using Lambda Expression
9              Consumer<Integer> squareMe = i -> System.out.println(i * i);
10             squareMe.accept(15);
```

<br/>

# Function Functional Interface?

Function interface will take 1 input and return 1 output. Not necessarily boolean like predicate.

Function interface have only 1 abstract method **apply().** i.e R apply(T t)

Function accepts any type of input and returns any type of output.

> **Function<Integer, Integer>** - Here 1st Integer is input arg and 2nd Integer is for output arg

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/FunctionDemo.java
```java
7              Function<Integer, Integer> squareMe = i -> i * i;
8              Integer result = squareMe.apply(5);
```

<br/>

**Functional Chaining:**

Functional chaining is helpful to perform multiple operations at the same time.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/FunctionDemo.java
```java
16             Integer chainResult = squareMe.andThen(cubeMe).apply(3);
17             System.out.println(chainResult);
```

<br/>

<br/>

<br/>

<br/>

<br/>

This file was generated by Swimm. [Click here to view it in the app](https://app.swimm.io/repos/Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x/docs/fx5ktnnk).

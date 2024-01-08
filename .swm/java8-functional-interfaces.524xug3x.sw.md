---
title: java8-functional-interfaces
---
<https://youtu.be/oUdENE7ljjw?si=oiaMd_QlDlb4iPjH>

# Why Java8 Introduced ?

1. Java8 was introduced to make code concise and more readable.

2. Java8 introduced ***functional programming*** with *Lambda expressions* which creates a concise code base.

3. To improve the *performance* and *scalability* of Java applications.

# What are new features introduced in Java8 ?

## **Lambda expressions:**

- Lambda expressions allow you to write concise and expressive code. They are a type of ***anonymous function*** that can be used anywhere a function is required.

- Lambda expressions are referenced by functional interfaces and ***they will be executed when we call the abstract method of functional interface***.

<SwmSnippet path="/com/code/java8/functionalinterfaces/LambdaDemo.java" line="9" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.print(a + b);
        biConsumer.accept(3,5);
```

---

</SwmSnippet>

## **Functional interfaces:**

- A functional interface is an interface that contains ***only one abstract method***.

- Functional interface must / should have at least one abstract method.

- Functional interface can contain any number of ***default and static methods***.

- Functional interfaces holds the references of Lambda expressions.

- We can create our own functional interface.

  - Mark the class as @FuntionalInterface (Optional).

  - Create one abstract method.

  - Can have nothing to any number of default and static methods.

  - Must / should create at least one abstract method.

<SwmSnippet path="/com/code/java8/functionalinterfaces/FunctionalInterfaceDemo.java" line="3" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void printResult();

    default void printName() {
        System.out.println("Print Name");
    }

    static void printAge() {
        System.out.println("Print Age");
    }
}
```

---

</SwmSnippet>

## **Method references:**

- Method references allow you to ***refer to an existing method without having to call it***.

- Method reference is the replacement of Lambda expression.

- It gives the feature of code reusability.

> **Code reusable** - Whenever there is an existing implementation code available then we can use method reference. If existing code is not available then we can go for writing the code using lambda expression.

<SwmSnippet path="/com/code/java8/functionalinterfaces/MethodReferenceDemo.java" line="4" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
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
```

---

</SwmSnippet>

## **Default methods:**

Interfaces can now have default methods. ***This allows you to add new functionality to an interface without breaking existing code.***

> You can override the default method by keeping the same method signature (need to add public access modifier in overridden class).

<SwmSnippet path="/com/code/java8/functionalinterfaces/FunctionalInterfaceDemo.java" line="8" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    default void printName() {
        System.out.println("Print Name");
    }
```

---

</SwmSnippet>

## **Optional:**

The Optional class represents a value that may or may not be present. This can be useful for avoiding NullPointerExceptions.

## **Stream API:**

The Stream API provides a powerful way to process collections of data. ***Streams are lazy, so they are only evaluated when necessary***.

## **Parallel array sorting:**

The Arrays class now has a ***parallelSort()*** method that can be used to sort arrays in parallel.

## **Date API**

# **Why static methods were introduced in java8 ?**

Creating class and then its object is costly. Since interface can never contain *Constructors, Static blocks.* Hence we don't need to create object which need low memory and improves performance.

# Predicate Functional Interface ?

Predicate is a functional interface having only one abstract method, i.e public boolean test(T t) **to check the boolean conditions.**

Predicate takes 1 input and always **returns boolean**.

*Advantage of Predicate:*

**Code Reusability:** If you have same condition being used multiple times, then Instead of writing multiple if conditions or ternary conditions to validate, we will define the logic at one place as lamba expression like below and pass different types of values as input. So logic will be at one place and only type of input data will change.

<SwmSnippet path="/com/code/java8/functionalinterfaces/PredicateFunctionDemo.java" line="8" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Predicate<String> checkLength = s -> s.length() >= 10;
        boolean validateString = checkLength.test("Hello this is Test");
```

---

</SwmSnippet>

### Predicate Joining:

We can join multiple condition use and() or() negate()

> we use negate() for the opposite of value. If the result is true, then adding negate() will make the value false.
>
> Negate works with only one predicate.

<SwmSnippet path="/com/code/java8/functionalinterfaces/PredicateFunctionDemo.java" line="17" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        boolean combinedResult = checkLength.and(checkValue).test("Code Decode");
//        System.out.println(combinedResult);
```

---

</SwmSnippet>

# Consumer Functional Interface ?

Consumer is a functional interface having only one abstract method, i.e public void accept(T t) that accepts only one argument and **doesn't return nothing**.

Consumer takes 1 input and return nothing.

<SwmSnippet path="/com/code/java8/functionalinterfaces/ConsumerFunctionDemo.java" line="7" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void main(String[] args) {
//        Using Lambda Expression
        Consumer<Integer> squareMe = i -> System.out.println(i * i);
        squareMe.accept(15);
```

---

</SwmSnippet>

**Consumer Chaining:**

<SwmSnippet path="/com/code/java8/functionalinterfaces/ConsumerFunctionDemo.java" line="20" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        sqareMe.andThen(squareMe1).accept(3);
```

---

</SwmSnippet>

# Supplier Functional Interface ?

Supplier is opposite to Consumer. It takes nothing but returns output.

<SwmSnippet path="/com/code/java8/functionalinterfaces/SupplierFunctionDemo.java" line="8" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
```

---

</SwmSnippet>

There is no input that we provide to the supplier, hence there is no functional chaining.

# Function Functional Interface?

Function interface will take 1 input and return 1 output. Not necessarily boolean like predicate.

Function interface have only 1 abstract method **apply().** i.e R apply(T t)

Function accepts any type of input and returns any type of output.

> **Function<Integer, Integer>** - Here 1st Integer is input arg and 2nd Integer is for output arg

<SwmSnippet path="/com/code/java8/functionalinterfaces/FunctionDemo.java" line="7" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Function<Integer, Integer> squareMe = i -> i * i;
        Integer result = squareMe.apply(5);
```

---

</SwmSnippet>

**Functional Chaining:**

Functional chaining is helpful to perform multiple operations at the same time.

<SwmSnippet path="/com/code/java8/functionalinterfaces/FunctionDemo.java" line="16" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Integer chainResult = squareMe.andThen(cubeMe).apply(3);
        System.out.println(chainResult);
```

---

</SwmSnippet>

&nbsp;

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ=" repo-name="java-iq"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>

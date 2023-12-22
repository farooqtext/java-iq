---
id: nh31dum5
title: Java8 Streams
file_version: 1.1.3
app_version: 1.18.42
---

Streams works on Collection object. i.e on List, Set, Map.

If you want to perform bulk operation on collection object then we use streams.

# Steps involved in streams?

1.  **Creating:** Creating step is nothing but adding the data to some collection object like List or Set or Map.

2.  **Configuring:** Configuring a stream will be done in 2 ways. By using filter() and by using map()

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x%2Fd2480d6c-dc21-441d-bd74-2e78037bbf86.png?alt=media&token=c7304c07-ec77-461f-9d85-a31d6cbf08ff" style="width:'100%'"/></div>

<br/>

1.  **Processing:** Processing a stream will be done in 7 ways. By using collect(), count(), sorted() etc..

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x%2Fc1407368-e60f-459d-95d7-2d8aa8c83a50.png?alt=media&token=4573b30c-282b-48ec-b8dd-91970cad5822" style="width:'100%'"/></div>

<br/>

# What is difference between filter and map?

filter - filter is used to filter or fetch the data in the collection object.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
17             List modifiedList = list.stream().filter(x -> x >= 15).collect(Collectors.toList());
18             modifiedList.stream().forEach(x -> System.out.println(x));
```

<br/>

map - map is used to perform some operation to the collection object.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
21             list.stream().map(i -> i * i).forEach(x -> System.out.println(x));
```

<br/>

# Processing methods

**collect** - collect is used to collect the data to some list or set or map

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
23             List collectedList = list.stream().filter(x -> x >= 15).collect(Collectors.toList());
```

<br/>

**count -** count is used to count the number of elements in the stream.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
25             long streamCount = collectedList.stream().count();
```

<br/>

**sorted -** If you want to sort the data in the stream in a natural order, then use sorted()

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
27             Stream sortedList = list.stream().sorted((i1, i2) -> i1.compareTo(i2));
28             sortedList.forEach(x -> System.out.println(x));
```

<br/>

**min** - to find minimum number

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
31             Integer minimum = list.stream().min((x1, x2) -> x1.compareTo(x2)).get();
```

<br/>

**max** - to find the maximum number

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
34             Integer maximum = list.stream().max((x1, x2) -> x1.compareTo(x2)).get();
```

<br/>

**toArray -** To convert an object into array

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
37             Object[] objArray = list.stream().toArray();
```

<br/>

**Stream.of() -** To convert any number or string array into stream

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
42             Stream<Integer> streamArray = Stream.of(2, 5, 2, 8);
```

<br/>

# What is Parallel Stream?

Today we have multiple core processors, like quad core, hexa core, octa core processors. If we are executing the tasks on one core, then we are making other cores idle which we are not using the resource efficiently.

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x%2Fc42940cc-a1d3-4105-86da-17ff06abab3a.png?alt=media&token=99b5a896-9889-4074-8031-c55bd8e12404" style="width:'100%'"/></div>

<br/>

So java people came up with the concept of parallel stream, where we can execute the tasks on diff core processors at the same time.

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x%2F94502118-dcd3-4012-a561-85013e5bf217.png?alt=media&token=00f64839-6084-490d-8bdf-2d188be524d2" style="width:'100%'"/></div>

<br/>

> If the order of execution doesn't matter then only we need to use parallel streams.

# Streams Chart

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x%2F1729139c-60aa-4512-a4fb-606adb6d7069.png?alt=media&token=41027764-77aa-499c-8506-485dc5453302" style="width:'100%'"/></div>

<br/>

## What is an intermediate operation?

After some operation which returns another stream as a result are called intermediate operation or non-terminal operation.

Intermediate operations are lazy.

## What is a terminal operation?

After some operation terminal operation returns non-stream result such as primitives, object or collection.

Intermediate operation do give any result until terminal operation is invoked.

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x%2F806952e7-36fa-4adc-892a-ac0f0b3d7ed7.png?alt=media&token=18228e78-08c8-47bd-a3d7-9629d322a137" style="width:'100%'"/></div>

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x%2Febab34cc-c28f-4057-8d5a-e4813c5bf2e9.png?alt=media&token=62fdd69e-07c9-49a5-a373-0ad387b52c22" style="width:'100%'"/></div>

<br/>

# What is Peek ?

peek() is used mainly for debugging, so that we can see the intermediate results in the stream operation.

It takes consumer object and perform some operation and returns nothing.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
44             List list2 = list.stream().filter(x -> x % 2 == 0).peek(System.out::println)
45                     .map(x -> x + 2).filter(x -> x >= 5)
46                     .map(x -> x * 2).collect(Collectors.toList());
```

<br/>

# what is reduce?

reduce is used to get the sum of all the values.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
49             Integer count = list.stream().reduce((a,b)-> a+b).get();
```

<br/>

# Short circuit operations

**Intermediate operation** - limit()

**Terminal operation** - findFirst(), findAny(), anyMatch(), allMatch(), noneMatch()

**_Idempotent_** _\- Which gives same result, how many times you execute. findFirst() is Idempotent, where as findAny() is not._

# Difference between limit and skip

**limit** - limit will return the first n elements of the given size.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
52             list.stream().limit(3).forEach(System.out::println);
```

<br/>

**skip** - skip will trim or skip the first n elements of the given size.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
54             list.stream().skip(2).forEach(System.out::println);
```

<br/>

# Old vs New Hashtable internal implementation

watch the video:

<br/>

[<--VIDEO-->](https://youtu.be/7k0VYHuUF6g?si=n5yPVB84dMZ4m-aN)

<br/>

# map vs flatmap

<br/>

[<--VIDEO-->](https://youtu.be/TM6TZvVoAko?si=cprdjfbV-pXT4BQt)

<br/>

<br/>

**map**: The `map` function is used to transform each element of a stream using a provided function. It applies the given function to each element of the stream and produces a new stream of the transformed values. The result is a one-to-one mapping between the elements of the original stream and the elements of the new stream.

```java
List<String> words = Arrays.asList("Hello", "World");
List<Integer> wordLengths = words.stream()
                                .map(String::length)
                                .collect(Collectors.toList());
// Result: [5, 5]
```

**flatmap:** The `flatMap` function is similar to `map`, but it is used when each element of the stream can be mapped to multiple values, and you want to flatten the result into a single stream. It "flattens" nested collections or streams into a single stream.

```java
List<List<Integer>> numbers = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5, 6),
    Arrays.asList(7, 8, 9)
);
List<Integer> flattenedList = numbers.stream()
                                    .flatMap(List::stream)
                                    .collect(Collectors.toList());
// Result: [1, 2, 3, 4, 5, 6, 7, 8, 9]
```

# GroupingBy

The `groupingBy` collector in Java 8 is part of the `Collectors` utility class and is used in conjunction with the Stream API. It is designed for grouping elements of a stream based on a classifier function. Here's a breakdown of how it works:

*   The `groupingBy` collector takes a classifier function as an argument. This function is applied to each element of the stream, and the results are used as keys for grouping.

*   The collector returns a `Map` where the keys are the result of applying the classifier function, and the values are Lists containing the elements that share the same key.

*   It's often used for tasks such as categorizing or partitioning data based on specific criteria.

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/GroupingByDemo.java
```java
45             Map<Integer, List<Person>> peopleByAge = people.stream().collect(Collectors.groupingBy(Person::getAge, TreeMap::new, Collectors.toList()));
```

<br/>

# Optional

`Optional` is a class introduced in Java 8 to address the problem of dealing with potentially null values in a more expressive and less error-prone way. It encourages explicit handling of the presence or absence of a value, and it helps to avoid `NullPointerExceptions`. Here are key points about `Optional`:

1.  **Avoiding Null:**

    *   `Optional` is designed to eliminate the use of `null` references. Instead of returning `null` from a method to indicate the absence of a value, you can return an `Optional` instance.

2.  **Creation:**

    *   You can create an `Optional` using static factory methods like `Optional.of(value)`, `Optional.empty()`, or `Optional.ofNullable(value)`.

3.  **Accessing Values:**

    *   You can retrieve the value from an `Optional` using methods like `get()`, but it's generally recommended to use methods like `orElse(defaultValue)` or `orElseGet(supplier)` to provide default values or fallback actions.

4.  **Chaining:**

    *   `Optional` supports method chaining for concise handling of values. You can use methods like `map`, `flatMap`, and `filter` to transform or filter the contents of the `Optional`.

5.  **Avoiding NullPointerExceptions:**

    *   By using `Optional`, you make it explicit that a value may be absent, and developers need to consciously handle both cases (presence and absence). This helps to reduce the risk of unintentional `NullPointerExceptions`.

```java
	// Creating an Optional with a non-null value
        Optional<String> optionalWithValue = Optional.of("Hello, Optional!");

        // Creating an empty Optional
        Optional<String> optionalEmpty = Optional.empty();

        // Creating an Optional from a potentially null value
        String nullableValue = null;
        Optional<String> optionalNullable = Optional.ofNullable(nullableValue);
```

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/java8/streams/StreamsDemo.java
```java
58             Optional<String> optionalWithValue = Optional.of("Hello, Optional!");
59             // Getting the value (unsafe, may throw NoSuchElementException)
60             String value = optionalWithValue.get();
61             System.out.println("Value: " + value);
62     
63             // Using orElse to provide a default value
64             String defaultValue = optionalWithValue.orElse("Default Value");
65             System.out.println("Value or Default: " + defaultValue);
66     
67             // Using orElseGet with a Supplier for lazy default value computation
68             String lazyDefault = optionalWithValue.orElseGet(() -> generateDefaultValue());
69             System.out.println("Value or Lazy Default: " + lazyDefault);
```

<br/>

This file was generated by Swimm. [Click here to view it in the app](https://app.swimm.io/repos/Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x/docs/nh31dum5).

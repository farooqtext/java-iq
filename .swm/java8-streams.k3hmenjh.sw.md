---
title: Java8 Streams
---
Streams works on Collection object. i.e on List, Set, Map.

If you want to perform bulk operation on collection object then we use streams.

# Steps involved in streams?

1. **Creating:** Creating step is nothing but adding the data to some collection object like List or Set or Map.

2. **Configuring:** Configuring a stream will be done in 2 ways. By using filter() and by using map()

![](https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ%3D%2Fa36cf819-3129-4897-8a60-87e943e1a636.png?alt=media&token=c273ebb0-6070-4913-8f2d-f79c7c823b31)

1. **Processing:** Processing a stream will be done in 7 ways. By using collect(), count(), sorted() etc..

![](https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ%3D%2F64ee364d-379c-4c81-80a6-51c892e7e043.png?alt=media&token=5b356498-4a41-4476-b6c1-9d63c9f4d902)

# What is difference between filter and map?

filter - filter is used to filter or fetch the data in the collection object.

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="17" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        List modifiedList = list.stream().filter(x -> x >= 15).collect(Collectors.toList());
        modifiedList.stream().forEach(x -> System.out.println(x));
```

---

</SwmSnippet>

map - map is used to perform some operation to the collection object.

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="21" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        list.stream().map(i -> i * i).forEach(x -> System.out.println(x));
```

---

</SwmSnippet>

# Processing methods

**collect** - collect is used to collect the data to some list or set or map

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="23" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        List collectedList = list.stream().filter(x -> x >= 15).collect(Collectors.toList());
```

---

</SwmSnippet>

**count -** count is used to count the number of elements in the stream.

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="25" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        long streamCount = collectedList.stream().count();
```

---

</SwmSnippet>

**sorted -** If you want to sort the data in the stream in a natural order, then use sorted()

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="27" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Stream sortedList = list.stream().sorted((i1, i2) -> i1.compareTo(i2));
        sortedList.forEach(x -> System.out.println(x));
```

---

</SwmSnippet>

**min** - to find minimum number

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="31" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Integer minimum = list.stream().min((x1, x2) -> x1.compareTo(x2)).get();
```

---

</SwmSnippet>

**max** - to find the maximum number

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="34" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Integer maximum = list.stream().max((x1, x2) -> x1.compareTo(x2)).get();
```

---

</SwmSnippet>

**toArray -** To convert an object into array

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="37" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Object[] objArray = list.stream().toArray();
```

---

</SwmSnippet>

**Stream.of() -** To convert any number or string array into stream

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="42" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Stream<Integer> streamArray = Stream.of(2, 5, 2, 8);
```

---

</SwmSnippet>

# What is Parallel Stream?

Today we have multiple core processors, like quad core, hexa core, octa core processors. If we are executing the tasks on one core, then we are making other cores idle which we are not using the resource efficiently.

![](https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ%3D%2F3d5d671e-e43c-4153-83be-a6e5fba668af.png?alt=media&token=dc59587c-06aa-4ddd-8711-ea8a0da07f8c)

So java people came up with the concept of parallel stream, where we can execute the tasks on diff core processors at the same time.

![](https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ%3D%2F2ab4a91c-b13b-4ef5-a9fa-e8c328312150.png?alt=media&token=df7b7815-3003-4ad9-b62b-347d102c22ec)

> If the order of execution doesn't matter then only we need to use parallel streams.

# Streams Chart

![](https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ%3D%2F21587832-6933-4868-8525-59baa11389ac.png?alt=media&token=7726f27e-cb5c-4e0b-ac47-90579ae8d849)

## What is an intermediate operation?

After some operation which returns another stream as a result are called intermediate operation or non-terminal operation.

Intermediate operations are lazy.

## What is a terminal operation?

After some operation terminal operation returns non-stream result such as primitives, object or collection.

Intermediate operation do give any result until terminal operation is invoked.

# ![](https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ%3D%2F6c3b9328-fe06-44b8-aa30-9178cc67a81e.png?alt=media&token=09f5e556-0a0e-494c-bd8b-1d5e92033b63)![](https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ%3D%2Fe7f71400-dd99-4cdd-882c-e4db2f45ded0.png?alt=media&token=e0d5166e-155f-4204-874d-05f6412b89e4)

# What is Peek ?

peek() is used mainly for debugging, so that we can see the intermediate results in the stream operation.

It takes consumer object and perform some operation and returns nothing.

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="44" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        List list2 = list.stream().filter(x -> x % 2 == 0).peek(System.out::println)
                .map(x -> x + 2).filter(x -> x >= 5)
                .map(x -> x * 2).collect(Collectors.toList());
```

---

</SwmSnippet>

# what is reduce?

reduce is used to get the sum of all the values.

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="49" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        Integer count = list.stream().reduce((a,b)-> a+b).get();
```

---

</SwmSnippet>

# Short circuit operations

**Intermediate operation** - limit()

**Terminal operation** - findFirst(), findAny(), anyMatch(), allMatch(), noneMatch()

***Idempotent*** *- Which gives same result, how many times you execute. findFirst() is Idempotent, where as findAny() is not.*

# Difference between limit and skip

**limit** - limit will return the first n elements of the given size.

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="52" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        list.stream().limit(3).forEach(System.out::println);
```

---

</SwmSnippet>

**skip** - skip will trim or skip the first n elements of the given size.

<SwmSnippet path="/com/code/java8/streams/StreamsDemo.java" line="54" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
        list.stream().skip(2).forEach(System.out::println);
```

---

</SwmSnippet>

# Old vs New Hashtable internal implementation  (watch code decode YT)

# map vs flatmap (watch code decode YT)

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
List<List<Integer>> numbers =
```

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ=" repo-name="java-iq"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>

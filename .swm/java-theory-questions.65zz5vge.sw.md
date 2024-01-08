---
title: Java Theory Questions
---
# **Where Primitive datatypes are stored?**

Primitive datatypes are stored in STACK.

# **What is JIT?**

A just-in-time (JIT) compiler compiles bytecode sequences into machine code.

JIT is one of the components of JVM. JVM compiles complete byte code to machine code. JIT compiles only the **reusable byte code** to machine code.

JIT is enabled by default, and is activated when a Java method is called. The JIT compiler compiles the bytecode of that method into native machine code, compiling it "just in time" to run.

# **Why String is immutable in Java?**

Once the object is created you cannot modify the existing object. If you try to modify, it will create one more object with the new changes along with the existing changes. This is called **Immutability**.

Strings are most frequently used datatypes in java. If the string is not immutable then **shared references can change the existing object** which leads to *data inconsistency* and leads to *security concerns*.

# **What is marker interface?**

A marker interface doesn't have any data members and methods. Its an empty interface. **Ex**: Serializable, Clonable.

These interfaces are used to provide additional information to the compiler about our implemented classes. These interfaces will give specific features to our class at run time.

# **Can you override a private or static method in java?**

We cannot override either a private or static method.

1. In case of private it will be treated as its own normal method.

2. In case of **static** it is method hiding, but not overriding.

# **Do finally always execute in Java?**

Yes, except in 2 cases. System.exit(0); and System crash

# **What methods available in Object class?**

clone(), equals(), finalize(), getClass(), hashcode(), toString(), wait(), notify(), notifyAll()

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ=" repo-name="java-iq"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>

---
title: Print Patterns
---
### Program to print rectangle

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="7" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void printRectangle() {
        for(int i=1;  i<= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print HallowRectangle

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="15" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void printHallowRectangle() {
        int n = 5;
        int m = 5;
        for(int i=1; i<= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print Half Pyramid

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="29" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void printHalfPyramid() {
        int n = 4;
        for(int i=1; i <= n; i++) {
            for(int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print Inverted HalfPyramid

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="38" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void invertedHalfPyramid() {
        int n = 4;
        int m = 4;
        for(int i=1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print Floyd's Triangle

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="51" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void floydsTriangle() {
        int n = 5;
        int number = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print 0 1 Triangle

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="62" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void zeroOneTriangle() {
        int n=5;
        for(int i=1; i<= n; i++) {
            for(int j=1; j <= i; j++) {
                int sum = i + j;
                if(sum % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print Butterfly Pattern

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="77" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void butterflyPattern() {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print Rombus Pattern

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="107" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void rombusPattern() {
        int n=5;
        for(int i=0; i<=n; i++) {
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1; j <= n; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print Pyramid Pattern

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="121" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void pyramidPattern() {
        int n = 5;
        for(int i=1; i<= n; i++) {
            int spaces = n - i;
            for(int j=1; j<= spaces; j++) {
                System.out.print(" ");
            }
            for(int j=1; j <= i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

### Program to print Palindromic Pattern

<SwmSnippet path="/com/code/logics/PrintPatterns.java" line="136" repo-id="Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x" repo-name="Java-FAQ">

---

&nbsp;

```java
    public static void palindromicPattern() {
        int n=5;
        for(int i=1; i <= n; i++) {
            for(int j=1; j<= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
```

---

</SwmSnippet>

<SwmMeta version="3.0.0" repo-id="Z2l0aHViJTNBJTNBamF2YS1pcSUzQSUzQWZhcm9vcXRleHQ=" repo-name="java-iq"><sup>Powered by [Swimm](https://app.swimm.io/)</sup></SwmMeta>

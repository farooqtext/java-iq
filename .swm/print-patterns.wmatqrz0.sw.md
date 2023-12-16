---
id: wmatqrz0
title: Print Patterns
file_version: 1.1.3
app_version: 1.18.37
---

Youtube Source

<br/>

[<--VIDEO-->](https://www.youtube.com/watch?v=GjHNGM7KN3w&list=PLfqMhTWNBTe0gqgFk-CUE-ktO5Cek1GdP&index=20)

<br/>

### Program to print rectangle

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2Fc9bc2046-c38a-4f97-af2a-68ba6d0d7eae.png?alt=media&token=346e306f-5bce-42a9-8c8d-b31364c0355d" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
7          public static void printRectangle() {
8              for(int i=1;  i<= 4; i++) {
9                  for (int j = 1; j <= 5; j++) {
10                     System.out.print("*");
11                 }
12                 System.out.println();
13             }
14         }
```

<br/>

### Program to print HallowRectangle

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2Fe9831ac3-58e1-45c2-94ce-e8279ef68d96.png?alt=media&token=e5a0209c-e768-49cf-b66c-683350f13fb0" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
15         public static void printHallowRectangle() {
16             int n = 5;
17             int m = 5;
18             for(int i=1; i<= n; i++) {
19                 for(int j = 1; j <= m; j++) {
20                     if(i == 1 || j == 1 || i == n || j == m) {
21                         System.out.print("*");
22                     } else {
23                         System.out.print(" ");
24                     }
25                 }
26                 System.out.println();
27             }
28         }
```

<br/>

### Program to print Half Pyramid

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2F93071f4d-da10-4f85-9228-5946f23b503b.png?alt=media&token=226ae81c-775e-4841-8d6a-aa51c9212272" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
29         public static void printHalfPyramid() {
30             int n = 4;
31             for(int i=1; i <= n; i++) {
32                 for(int j = i; j <= n; j++) {
33                     System.out.print("*");
34                 }
35                 System.out.println();
36             }
37         }
```

<br/>

### Program to print Inverted HalfPyramid

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2F476b2b03-e07e-46fe-a44c-377ddf62ef78.png?alt=media&token=c41e4e45-1892-4d0d-b140-9e419ec99c32" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
38         public static void invertedHalfPyramid() {
39             int n = 4;
40             int m = 4;
41             for(int i=1; i <= n; i++) {
42                 for(int j = 1; j <= n - i; j++) {
43                     System.out.print(" ");
44                 }
45                 for(int j= 1; j <= i; j++) {
46                     System.out.print("*");
47                 }
48                 System.out.println();
49             }
50         }
```

<br/>

### Program to print Floyd's Triangle

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2Fbe50fb91-d16c-4f80-a5ef-79e3013d4975.png?alt=media&token=f3193f3d-a228-4f6a-9f07-554cb74db14c" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
51         public static void floydsTriangle() {
52             int n = 5;
53             int number = 1;
54             for(int i = 1; i <= n; i++) {
55                 for(int j = 1; j <= i; j++) {
56                     System.out.print(number++ + " ");
57                 }
58                 System.out.println();
59             }
60         }
```

<br/>

### Program to print 0 1 Triangle

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2F9e86f6a2-0ca4-4c0f-9219-2a3ece1db37d.png?alt=media&token=8adec9a0-7eb2-4ca1-8792-44eaefef03f5" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
62         public static void zeroOneTriangle() {
63             int n=5;
64             for(int i=1; i<= n; i++) {
65                 for(int j=1; j <= i; j++) {
66                     int sum = i + j;
67                     if(sum % 2 == 0) {
68                         System.out.print(1);
69                     } else {
70                         System.out.print(0);
71                     }
72                 }
73                 System.out.println();
74             }
75         }
```

<br/>

### Program to print Butterfly Pattern

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2Fdbc15aeb-6f5c-4a7e-923e-22195abcb651.png?alt=media&token=bf3b1de7-f828-42a4-b888-35043709324b" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
77         public static void butterflyPattern() {
78             int n = 4;
79             for(int i = 1; i <= n; i++) {
80                 for(int j = 1; j <= i; j++) {
81                     System.out.print("*");
82                 }
83                 int spaces = 2 * (n - i);
84                 for(int j = 1; j <= spaces; j++) {
85                     System.out.print(" ");
86                 }
87                 for(int j = 1; j <= i; j++) {
88                     System.out.print("*");
89                 }
90                 System.out.println();
91             }
92             for(int i = 4; i >= 1; i--) {
93                 for(int j = 1; j <= i; j++) {
94                     System.out.print("*");
95                 }
96                 int spaces = 2 * (n - i);
97                 for(int j = 1; j <= spaces; j++) {
98                     System.out.print(" ");
99                 }
100                for(int j = 1; j <= i; j++) {
101                    System.out.print("*");
102                }
103                System.out.println();
104            }
105        }
```

<br/>

### Program to print Rombus Pattern

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2Fa4d203b8-d14e-40b4-8cd9-e81d5d866075.png?alt=media&token=881bf150-0724-48ac-91ac-5c170db630ff" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
107        public static void rombusPattern() {
108            int n=5;
109            for(int i=0; i<=n; i++) {
110                int spaces = n - i;
111                for(int j = 1; j <= spaces; j++) {
112                    System.out.print(" ");
113                }
114                for(int j=1; j <= n; j++ ){
115                    System.out.print("*");
116                }
117                System.out.println();
118            }
119        }
```

<br/>

### Program to print Pyramid Pattern

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2Ffe4fb7ec-a793-4d93-a3e2-8c5c8013c48b.png?alt=media&token=c99f483c-d08b-4d4f-97d4-3481aa327508" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
121        public static void pyramidPattern() {
122            int n = 5;
123            for(int i=1; i<= n; i++) {
124                int spaces = n - i;
125                for(int j=1; j<= spaces; j++) {
126                    System.out.print(" ");
127                }
128                for(int j=1; j <= i; j++) {
129                    System.out.print(i);
130                    System.out.print(" ");
131                }
132                System.out.println();
133            }
134        }
```

<br/>

### Program to print Palindromic Pattern

<br/>

<div align="center"><img src="https://firebasestorage.googleapis.com/v0/b/swimmio.appspot.com/o/repositories%2FZ2l0aHViJTNBJTNBSW50ZXJ2aWV3UXVlc3Rpb25zJTNBJTNBZmFyb29vcQ%3D%3D%2F61d3e894-2fba-4815-8224-9864c11c926d.png?alt=media&token=c59e7e38-fe24-4602-81d9-64a40bb99810" style="width:'50%'"/></div>

<br/>


<!-- NOTE-swimm-snippet: the lines below link your snippet to Swimm -->
### 📄 com/code/logics/PrintPatterns.java
```java
136        public static void palindromicPattern() {
137            int n=5;
138            for(int i=1; i <= n; i++) {
139                for(int j=1; j<= n - i; j++) {
140                    System.out.print(" ");
141                }
142                for(int j = i; j >= 1; j--) {
143                    System.out.print(j);
144                }
145                for(int j = 2; j <= i; j++) {
146                    System.out.print(j);
147                }
148                System.out.println();
149            }
150        }
```

<br/>

This file was generated by Swimm. [Click here to view it in the app](https://app.swimm.io/repos/Z2l0aHViJTNBJTNBSmF2YS1GQVElM0ElM0FmYXJvb29x/docs/wmatqrz0).

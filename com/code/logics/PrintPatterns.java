package com.code.logics;
public class PrintPatterns {
    public static void main(String[] args) {

        palindromicPattern();
    }
    public static void printRectangle() {
        for(int i=1;  i<= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
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
    public static void printHalfPyramid() {
        int n = 4;
        for(int i=1; i <= n; i++) {
            for(int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
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
}

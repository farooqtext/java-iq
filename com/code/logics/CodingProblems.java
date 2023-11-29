package com.code.logics;

public class CodingProblems {

    public static void main(String[] args) {
//        swapNumbersWithoutUsing3rdVariable();

//        int factorial = calculateFactorial(5);
//        System.out.println(factorial);

//        int xPowerN = calculateXPowerN(2, 5);
//        System.out.println(xPowerN);

//        int[] originalArrays = { 8, 7, 1, 2, 3, 4, 3, 5};
//        int elementToRemove = 3;
//        int[] newArray = removeElement(originalArrays, elementToRemove);
//        Arrays.stream(newArray).forEachOrdered(System.out::println);
    }

    public static void swapNumbersWithoutUsing3rdVariable() {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is " + a + " b is " + b);
    }

    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = calculateFactorial(n - 1);
        fact = fact * n;
        System.out.println(":: " + fact + " :: " + n);
        return fact;
    }

    public static int calculateXPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPowerN = calculateXPowerN(x, n - 1);
        int xPowerNValue = x * xPowerN;
        return xPowerNValue;
    }

    public static int[] removeElement(int[] originalArrays, int elementToRemove) {

        int[] newArray = new int[originalArrays.length - 1];

        int index = 0;

        for (int originalArray : originalArrays) {
            /*
                As we cannot remove the item from the array, so when ever there is a
                removal operation then we need to perform shift operation.
            */
            if (originalArray != elementToRemove) {
                newArray[index] = originalArray;
                index++;
            }
        }
        return newArray;
    }
}

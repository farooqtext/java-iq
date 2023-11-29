package com.code.logics;

//  Full Playlist:  https://youtu.be/PkJIc5tBRUE?si=DF_g2mj3c8ERS0XU
public class SortingProblems {
    public static void main(String[] args) {
        selectionSort();
    }

    /* In bubble sort we will push largest element to the end of the array in each iteration.
        if arr[j] > arr[j+1] swap them. To place the element in their respective position,
        we have to do the following operation N-1 times. */
    //    Time complexity = O(n^2)
    public static void bubbleSort() {
        int[] arrary = {10, 13, 8, 7, 11, 3};
        for (int i = 0; i < arrary.length - 1; i++) {
            for (int j = 0; j < arrary.length - i - 1; j++) {
                if (arrary[j] > arrary[j + 1]) {
                    int temp = arrary[j];
                    arrary[j] = arrary[j + 1];
                    arrary[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrary.length; i++) {
            System.out.println(arrary[i]);
        }
    }

    /* In selection sort we will push smallest elements to the first of the array in each iteration.
    The inner loop selects the minimum element in the unsorted array and places the elements in increasing order. */
    //    Time complexity = O(n^2)
    public static void selectionSort() {

        int[] array = {3, 8, 4, 2, 9};
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /* Here we will divide the array to 2 parts considering one part as sorted and another as unsorted.
    Take an element from the unsorted array, place it in its corresponding position
    in the sorted part, and shift the elements accordingl`y. */
    //    https://www.youtube.com/watch?v=rrfRRllt4c4
    public static void insertionSort() {
        int arr[] = {7, 8, 1, 3, 2};
        //insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                //Keep swapping
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
